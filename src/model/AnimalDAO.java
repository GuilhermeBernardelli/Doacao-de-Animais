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
 * @since 31/05/2016
 */
public class AnimalDAO {
    
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
    public void inserirNovoAnimal(Animal animal) throws ClassNotFoundException, SQLException, IOException{
        conexao = getConnection();
        stmt = conexao.createStatement();
               
        String sql = "INSERT INTO animal (nome, especie, registro, cor_primaria, raça, pedigree, octupla,"
                        + "quintupla, giardiase, antirrabica, gripecanina, outras, outras_detalhe, saudavel,"
                        + "nota, local_atual)VALUES('"
                        //+ "imagem1, imagem2)VALUES('"
                + animal.getNome() +"', '"
                + animal.getAnimal() + "'," 
                + animal.getRegistro() + ",'"
                + animal.getCorPrimaria() +"', '" 
                + animal.getRaça() +"', '"
                + animal.getPedigree() + "' , " 
                + animal.isOctupla() + ","
                + animal.isQuintupla() +", " 
                + animal.isGiardiase() +", "
                + animal.isAntirrabica() + "," 
                + animal.isGripeCanina() + ","
                + animal.isOutras() + ",'"
                + animal.getOutrasDetalhe() +"', '" 
                + animal.getSaudavel() +"', "
                + animal.getNota() + ",'" 
                + animal.getLocalAtual() + "');";
                //+ animal.getLocalAtual() + "','"
                //+ animal.getImagem1() + "','"
                //+ animal.getImagem2() + "');";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o animal"); 
    }
    
    //Busca por animal
    public ResultSet buscarAnimalNome(String animal) throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM animal WHERE nome = '" + animal + "'");
        return rs;
    }
    //Retorna tabela doação
    public ResultSet listarAnimal() throws ClassNotFoundException, SQLException {        
        ResultSet rs;//conjunto da seleção, guarda o resultado
        conexao = getConnection();
        stmt = conexao.createStatement();
        rs = stmt.executeQuery("SELECT * FROM animal");
        return rs;
    }
    //Metodo para alterar doação
    public void alterarDadosAnimal(Animal animal, String animalBusca) throws ClassNotFoundException, SQLException {
        conexao = getConnection();//estabelece a conexao
        stmt = conexao.createStatement();
        String sql;
        
        sql = "UPDATE animal SET "
                + "nome = '"+ animal.getNome() +"', "
                + "especie = '"+ animal.getAnimal() + "'," 
                + "registro = "+ animal.getRegistro() + ","
                + "cor_primaria = '"+ animal.getCorPrimaria() +"', " 
                + "raça = '"+ animal.getRaça() +"', "
                + "pedigree = '"+ animal.getPedigree() + "' , " 
                + "octupla = "+ animal.isOctupla() + ","
                + "quintupla = "+ animal.isQuintupla() +", " 
                + "giardiase = "+ animal.isGiardiase() +", "
                + "antirrabica = "+ animal.isAntirrabica() + "," 
                + "gripecanina = "+ animal.isGripeCanina() + ","
                + "outras = "+ animal.isOutras() + ","
                + "outras_detalhe = '"+ animal.getOutrasDetalhe() +"', " 
                + "saudavel = '"+ animal.getSaudavel() +"', "
                + "nota = "+ animal.getNota() + "," 
                + "local_atual = '"+ animal.getLocalAtual()
                //+ "imagem1 = "+ animal.getImagem1() +","
                //+ "imagem2 "+ animal.getImagem2() 
                + "' WHERE nome = '" + animalBusca + "';";
        
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados do animal");
    }
    //Método para excluir doação
    public void excluirAnimal(String animal) throws SQLException, ClassNotFoundException{
        conexao = getConnection();
        stmt = conexao.createStatement();
        String sql;
        sql = "DELETE FROM animal WHERE nome = '" + animal + "'";
        if(stmt.executeUpdate(sql) > 0)
            JOptionPane.showMessageDialog(null, "Animal excluido com sucesso!");
        else
            JOptionPane.showMessageDialog(null, "Animal não encontrado para exclusão!");
    }
}//fim da classe


   
