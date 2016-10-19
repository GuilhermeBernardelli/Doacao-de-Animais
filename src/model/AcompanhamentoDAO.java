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
public class AcompanhamentoDAO {
    
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
    public void inserirNovoAcompanhamento(Acompanhamento acompanhamento) throws ClassNotFoundException, SQLException, IOException{
        conexao = getConnection();
        stmt = conexao.createStatement();
               
        String sql = "INSERT INTO acompanhamento (animal, emAcompanhamento, ultimaVisita, proximaVisita, "                
                        + "ultimaVacina, proximaVacina, condiçãoVacina, condiçãoAtual, condiçãoAlimentação,"
                        + "condiçãoLocal, condiçãoLimpeza, dataInicio, dataFinal)VALUES('"
                + acompanhamento.getAnimal() + "',"
                + acompanhamento.isEmAcompanhamento() + ",'"
                + acompanhamento.getUltimaVisita() + "','" 
                + acompanhamento.getProximaVisita() + "','"
                + acompanhamento.getUltimaVacina() + "','" 
                + acompanhamento.getProximaVacina() + "',"
                + acompanhamento.isCondiçãoVacinas() + "," 
                + acompanhamento.isCondiçãoAtual() + ","
                + acompanhamento.isCondiçãoAlimentação() + "," 
                + acompanhamento.isCondiçãoLocal() + ","
                + acompanhamento.isCondiçãoLimpeza() + ",'"
                + acompanhamento.getDataInicio() + "','" 
                + acompanhamento.getDataFinal() + "');";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir"); 
    }
    
    //Busca por animal
    public ResultSet buscarAcompanhamentoNome(String animal) throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM acompanhamento WHERE animal = '" + animal + "'");
        return rs;
    }
    //Retorna tabela doação
    public ResultSet listarAcompanhamento() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT animal FROM acompanhamento");
        return rs;
    }
    
    public ResultSet listarAcompanhamentoRealizados() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM acompanhamento");
        return rs;
    }
    
    public ResultSet listarDoaçõesRealizadas() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM doações");
        return rs;
    }
    
    //Metodo para alterar doação
    public void alterarDadosAcompanhamento(Acompanhamento acompanhamento, String acompanhamentoBusca) throws ClassNotFoundException, SQLException {
        conexao = getConnection();//estabelece a conexao
        stmt = conexao.createStatement();
        String sql;
        
        sql = "UPDATE acompanhamento SET "
                + "animal = '"+ acompanhamento.getAnimal() + "'," 
                + "emAcompanhamento = "+ acompanhamento.isEmAcompanhamento() + ","
                + "ultimaVisita = '"+ acompanhamento.getUltimaVisita() + "'," 
                + "proximaVisita = '"+ acompanhamento.getProximaVisita() + "',"
                + "ultimaVacina = '"+ acompanhamento.getUltimaVacina() + "'," 
                + "proximaVacina = '"+ acompanhamento.getProximaVacina() + "',"
                + "condiçãoVacina = "+ acompanhamento.isCondiçãoVacinas() + "," 
                + "condiçãoAtual = "+ acompanhamento.isCondiçãoAtual() + ","
                + "condiçãoAlimentação = "+ acompanhamento.isCondiçãoAlimentação() + "," 
                + "condiçãoLocal = "+ acompanhamento.isCondiçãoLocal() + ","
                + "condiçãoLimpeza = "+ acompanhamento.isCondiçãoLimpeza() + ","
                + "dataInicio = '"+ acompanhamento.getDataInicio() + "', " 
                + "dataFinal = '"+ acompanhamento.getDataFinal()
                + "' WHERE animal = '" + acompanhamentoBusca + "';";
        
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados");
    }
    //Método para excluir doação
    public void excluirAcompanhamento(String acompanhamento) throws SQLException, ClassNotFoundException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "DELETE FROM acompanhamento WHERE animal = '" + acompanhamento + "'";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Acompanhamento excluido com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Acompanhamento não encontrado para exclusão!");
    }
}//fim da classe


   
