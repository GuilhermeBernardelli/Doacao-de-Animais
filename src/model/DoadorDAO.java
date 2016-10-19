package model;

import controller.ControlaDoação;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Classe criada para controlar a conexão com o banco de dados
 * @author Guilherme Bernardelli
 * @since 02/06/2016
 */
public class DoadorDAO {
    
    Connection conexao;
    ControlaDoação sequence = new ControlaDoação();
    Statement stmt;//Comandos Sql
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
       Connection con;
       Class.forName("com.mysql.jdbc.Driver");//testa o driver
       //pega a conexão
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doação","root","root");
       return con;
           
}
    //Método para gravar uma doação no BD
    public void inserirNovoDoador(Doador doador) throws ClassNotFoundException, SQLException, IOException{
        conexao = getConnection();
        stmt = conexao.createStatement();
               
        String sql = "INSERT INTO pessoa (nome, endereço, numero, complemento, bairro, cidade, estado,"                
                       + "telefone, telefoneCelular, telefoneOutro, cpf, rg, quantosAnimais, doador)VALUES('"
                + doador.getNome() + "','"
                + doador.getEndereço() + "','" 
                + doador.getNumero() + "','"
                + doador.getComplemento() + "','" 
                + doador.getBairro() + "','"
                + doador.getCidade() + "','" 
                + doador.getEstado() + "','"
                + doador.getTelefone() + "','" 
                + doador.getTelefoneCelular() + "','"
                + doador.getTelefoneOutro() + "','" 
                + doador.getCpf() + "','"
                + doador.getRg() + "',"
                + doador.getQuantosAnimais() + ","
                + 1 + ");";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir"); 
    }
    
    //Busca por animal
    public ResultSet buscarDoadorNome(String doador) throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM pessoa WHERE nome = '" + doador + "'");
        return rs;
    }
    //Retorna tabela doação
    public ResultSet listarDoador() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM pessoa WHERE doador = 1");
        return rs;
    }
    //Metodo para alterar doação
    public void alterarDadosDoador(Doador doador, String doadorBusca) throws ClassNotFoundException, SQLException {
        conexao = getConnection();//estabelece a conexao
        stmt = conexao.createStatement();
        String sql;
        
        sql = "UPDATE pessoa SET "
                + "nome = '"+ doador.getNome() + "'," 
                + "endereço = '"+ doador.getEndereço() + "'," 
                + "numero = '"+ doador.getNumero() + "',"
                + "complemento = '"+ doador.getComplemento() +"'," 
                + "bairro = '"+ doador.getBairro() + "',"
                + "cidade = '"+ doador.getCidade() + "'," 
                + "estado = '"+ doador.getEstado() + "',"
                + "telefone = '"+ doador.getTelefone() + "'," 
                + "telefoneCelular = '"+ doador.getTelefoneCelular() + "',"
                + "telefoneOutro = '"+ doador.getTelefoneOutro() + "'," 
                + "cpf = '"+ doador.getCpf() + "',"
                + "rg = '"+ doador.getRg() + "',"
                + "animaisDoados = '"+ doador.getAnimaisDoados() +"', " 
                + "quantosAnimais = "+ doador.getQuantosAnimais()
                + " WHERE nome = '" + doadorBusca + "';";
        
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados");
    }
    //Método para excluir doação
    public void excluirDoador(String doador) throws SQLException, ClassNotFoundException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "DELETE FROM pessoa WHERE nome = '" + doador + "'";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Dados não encontrados para exclusão!");
    }
}//fim da classe


   
