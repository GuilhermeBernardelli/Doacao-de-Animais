package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Classe criada para controlar a conexão com o banco de dados
 * @author Guilherme Bernardelli
 * @since 31/05/2016
 */
public class DoaçãoDAO {
    
    Connection conexao;
    Statement stmt;//Comandos Sql
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
       Connection con;
       Class.forName("com.mysql.jdbc.Driver");//testa o driver
       //pega a conexão
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doação","root","root");
       return con;
    }
    //Método para gravar uma doação no BD
    public void inserirNovaDoação(Doação doação, Doador doador, Receptor receptor) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql = "INSERT INTO doação VALUES("
                + doação.getCodigoAcompanhamento() +",'" 
                + doação.getAnimal() +"','"
                + doação.getReceptor() + "','" 
                + doação.getDoador() + "','"
                + doação.getDataDoação() +"');";
               
                if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir a doação");
        
    }
    public void listaAnimaisDoados(String doador) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        String sqlDoador = "UPDATE pessoa p SET p.animaisDoados = (SELECT COUNT(*)  FROM doação d WHERE d.doador = '"
                + doador + "' AND d.doador = p.nome);";
        
        stmt = conexao.createStatement();
        stmt.executeUpdate(sqlDoador);
    }
    
    public ResultSet listaAnimaisRecebidos(String receptor) throws ClassNotFoundException, SQLException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        ResultSet rs;
        
        String sqlReceptor = "SELECT animal FROM doação WHERE receptor = '" + receptor + "';";
        
        stmt = conexao.createStatement();
        rs = stmt.executeQuery(sqlReceptor);
        
        return rs;
    }
    //Busca por animal
    public ResultSet buscarDoaçãoAnimal(String animal) throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM doação WHERE animal = '" + animal + "'");
        return rs;
    }
    //Retorna tabela animal
    public ResultSet listarDoação() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM animal");
        return rs;
    }
    //retorna a tabela doação
    public ResultSet listarAnimaisDoados() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM doação");
        return rs;
    }
    //Metodo para alterar doação
    public void alterarDadosDoação(Doação doação, String animalBusca) throws ClassNotFoundException, SQLException {
        conexao = getConnection();//estabelece a conexao
        stmt = conexao.createStatement();
        String sql;
        
        sql = "UPDATE doação SET "
                + "id_acompanhamento = " + doação.getCodigoAcompanhamento() + "," 
                + "animal = '" + doação.getAnimal() + "',"
                + "receptor = '" + doação.getReceptor() + "'," 
                + "doador = '" + doação.getDoador()
                + "' WHERE animal = '" + animalBusca + "'";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados da doação");
    }
    //Método para excluir doação
    public void excluirDoação(String animal) throws SQLException, ClassNotFoundException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "DELETE FROM doação WHERE animal = '" + animal + "'";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Doação excluida com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Doação não encontrada para exclusão!");
    }
}//fim da classe


   
