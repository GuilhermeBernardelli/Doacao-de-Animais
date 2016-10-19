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
public class ReceptorDAO {
    
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
    public void inserirNovoReceptor(Receptor receptor) throws ClassNotFoundException, SQLException, IOException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        
        String sql = "INSERT INTO pessoa (nome, endereço, numero, complemento, bairro, cidade, estado,"                
                        + "telefone, telefoneCelular, telefoneOutro, cpf, rg,"
                        + "quantosAnimais, espaçoDisponivel, podeReceber, nota, receptor)VALUES('"
                + receptor.getNome() + "','"
                + receptor.getEndereço() + "','" 
                + receptor.getNumero() + "','"
                + receptor.getComplemento() + "','" 
                + receptor.getBairro() + "','"
                + receptor.getCidade() + "','" 
                + receptor.getEstado() + "','"
                + receptor.getTelefone() + "','" 
                + receptor.getTelefoneCelular() + "','"
                + receptor.getTelefoneOutro() + "','" 
                + receptor.getCpf() + "','"
                + receptor.getRg() + "',"                
                + receptor.getQuantosAnimais() + "," 
                + receptor.getEspaçoDisponivel() + "," 
                + receptor.isPodeReceber() + "," 
                + receptor.getNota() + ","
                + 1 + ");";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir"); 
    }
    
    //Busca por animal
    public ResultSet buscarReceptorNome(String receptor) throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM pessoa WHERE nome = '" + receptor + "'");
        return rs;
    }
    //Retorna tabela doação
    public ResultSet listarReceptor() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM pessoa WHERE receptor = 1");
        return rs;
    }
    //Metodo para alterar doação
    public void alterarDadosReceptor(Receptor receptor, String receptorBusca) throws ClassNotFoundException, SQLException {
        conexao = getConnection();//estabelece a conexao
        stmt = conexao.createStatement();
        String sql;
        
        sql = "UPDATE pessoa SET "
                + "nome = '"+ receptor.getNome() +"', " 
                + "endereço = '"+ receptor.getEndereço() + "'," 
                + "numero = '"+ receptor.getNumero() + "',"
                + "complemento = '"+ receptor.getComplemento() +"', " 
                + "bairro = '"+ receptor.getBairro() +"', "
                + "cidade = '"+ receptor.getCidade() + "' , " 
                + "estado = '"+ receptor.getEstado() + "',"
                + "telefone = '"+ receptor.getTelefone() +"', " 
                + "telefoneCelular = '"+ receptor.getTelefoneCelular() +"', "
                + "telefoneOutro = '"+ receptor.getTelefoneOutro() + "'," 
                + "cpf = '"+ receptor.getCpf() + "',"
                + "rg = '"+ receptor.getRg() + "',"
                + "animaisRecebidos = '"+ receptor.getAnimaisRecebidos() +"', " 
                + "quantosAnimais = "+ receptor.getQuantosAnimais()+", "
                + "espaçoDisponivel = "+ receptor.getEspaçoDisponivel()+", "
                + "podeReceber = "+ receptor.isPodeReceber()+", "
                + "nota = "+ receptor.getNota()
                + " WHERE nome = '" + receptorBusca + "';";
        
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados");
    }
    //Método para excluir doação
    public void excluirReceptor(String receptor) throws SQLException, ClassNotFoundException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "DELETE FROM pessoa WHERE nome = '" + receptor + "'";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Dados não encontrados para exclusão!");
    }
}//fim da classe


   
