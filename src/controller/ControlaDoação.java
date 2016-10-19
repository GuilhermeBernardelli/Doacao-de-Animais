/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Animal;
import model.AnimalDAO;
import model.Doação;
import model.DoaçãoDAO;
import model.Acompanhamento;
import model.AcompanhamentoDAO;
import model.Receptor;
import model.ReceptorDAO;
import model.Doador;
import model.DoadorDAO;

/**
 * Classe com as regras para manipular doações 
 * @author Guilherme Bernardelli
 * @since 31/05/2016
 */
public class ControlaDoação {
    
    //
    // Metodos de criação
    //
    public void criarDoação(Doação doação, Doador doador, Receptor receptor) throws ClassNotFoundException, SQLException{
        
        //Regras de validação
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        doaçãoDAO.inserirNovaDoação(doação, doador, receptor);
    }
    
    public void criarAnimal(Animal animal) throws ClassNotFoundException, SQLException, IOException{
        
        //Regras de validação
        AnimalDAO animalDAO = new AnimalDAO();
        animalDAO.inserirNovoAnimal(animal);
    }
    
    public void criarAcompanhamento(Acompanhamento acompanhamento) throws ClassNotFoundException, SQLException, IOException{
        
        //Regras de validação
        AcompanhamentoDAO acompanhamentoDAO = new AcompanhamentoDAO();
        acompanhamentoDAO.inserirNovoAcompanhamento(acompanhamento);
    }
    
    public void criarReceptor(Receptor receptor) throws ClassNotFoundException, SQLException, IOException{
        
        //Regras de validação
        ReceptorDAO receptorDAO = new ReceptorDAO();
        receptorDAO.inserirNovoReceptor(receptor);
    }
    
    public void criarDoador(Doador doador) throws ClassNotFoundException, SQLException, IOException{
        
        //Regras de validação
        DoadorDAO doadorDAO = new DoadorDAO();
        doadorDAO.inserirNovoDoador(doador);
    }
    
    //
    //Métodos de busca simples
    //
    public ResultSet buscarDoação(String animal) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        rs = doaçãoDAO.buscarDoaçãoAnimal(animal);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Doação não encontrada!");
        return rs;
    }
    
    public ResultSet buscarAnimal(String animal) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        AnimalDAO animalDAO = new AnimalDAO();
        rs = animalDAO.buscarAnimalNome(animal);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Animal não encontrado!");
        return rs;
    }
    
    public ResultSet buscarAcompanhamento(String acompanhamento) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        AcompanhamentoDAO acompanhamentoDAO = new AcompanhamentoDAO();
        rs = acompanhamentoDAO.buscarAcompanhamentoNome(acompanhamento);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Acompanhamento não encontrado!");
        return rs;
    }
    
    public ResultSet buscarReceptor(String receptor) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        ReceptorDAO receptorDAO = new ReceptorDAO();
        rs = receptorDAO.buscarReceptorNome(receptor);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Receptor não encontrado!");
        return rs;
    }
    
    public ResultSet buscarDoador(String doador) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        DoadorDAO doadorDAO = new DoadorDAO();
        rs = doadorDAO.buscarDoadorNome(doador);
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Doador não encontrado!");
        return rs;
    }
    
    //
    //Metodos de busca composta
    //
    public String listarDoação() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        String listagemDoação;
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        rs = doaçãoDAO.listarAnimaisDoados();
        listagemDoação = "ID\tNome\t\tReceptor\t\tDoador\t\tData";
        listagemDoação = listagemDoação + "\n=======================================================================================================";
        while (rs.next()) {            
            listagemDoação = listagemDoação 
                    +"\n"+rs.getString(1) 
                    +"\t"+rs.getString(2)
                    +"\t\t"+rs.getString(3)
                    +"\t\t"+rs.getString(4)
                    +"\t\t"+rs.getString(5);
        }
        return listagemDoação;
    }
    
    public String listarEmAcompanhamento() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        String listagemDoação;
        AcompanhamentoDAO acompanhamentoDAO = new AcompanhamentoDAO();
        rs = acompanhamentoDAO.listarAcompanhamentoRealizados();
        listagemDoação = "Animal\t ID\t   Ultima Visita   Próxima Visita   Ultima Vacina   Próxima Vacina   Data Inicio   Data Término";
        listagemDoação = listagemDoação + "\n=======================================================================================================";
        while (rs.next()) {            
            listagemDoação = listagemDoação 
                    +"\n"+rs.getString("animal")  
                    +"\t"+rs.getString("codigo") 
                    +"\t"+rs.getString("ultimaVisita") 
                    +"\t"+rs.getString("proximaVisita")
                    +"\t"+rs.getString("ultimaVacina") 
                    +"\t"+rs.getString("proximaVacina")
                    +"\t"+rs.getString("dataInicio") 
                    +"\t"+rs.getString("dataFinal");
        }
        return listagemDoação;
    }
    
    public String listaAnimaisRecebidos(String receptor) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        String listagemDoação;
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        rs = doaçãoDAO.listaAnimaisRecebidos(receptor);
        listagemDoação = "\tAnimais adotados:";
        listagemDoação = listagemDoação + "\n==================================";
        while (rs.next()) {            
            listagemDoação = listagemDoação 
                    +"\n"+rs.getString(1);
        }
        return listagemDoação;
    }
    
    public void quantosAnimaisDoados(String doador) throws ClassNotFoundException, SQLException {
        
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        doaçãoDAO.listaAnimaisDoados(doador);
        
    }
    
    public ResultSet listarAnimais() throws ClassNotFoundException, SQLException{
        ResultSet rs;
        AnimalDAO animalDAO = new AnimalDAO();
        rs = animalDAO.listarAnimal();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Animal não encontrado!");
        return rs;
    }
    
    public ResultSet listarAnimaisDoados() throws ClassNotFoundException, SQLException{
        ResultSet rs;
        DoaçãoDAO doaçãoDAO = new DoaçãoDAO();
        rs = doaçãoDAO.listarAnimaisDoados();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Não encontrado animais doados!");
        return rs;
    }
    
    public ResultSet listarReceptores() throws ClassNotFoundException, SQLException{
        ResultSet rs;
        ReceptorDAO receptorDAO = new ReceptorDAO();
        rs = receptorDAO.listarReceptor();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Não encontrado receptor cadastrado!");
        return rs;
    }
    
    public ResultSet listarDoadores() throws ClassNotFoundException, SQLException{
        ResultSet rs;
        DoadorDAO doadorDAO = new DoadorDAO();
        rs = doadorDAO.listarDoador();
        if (!rs.first())
            JOptionPane.showMessageDialog(null, "Não encontrado doador cadastrado!");
        return rs;
    }
    
    public String listarAcompanhamento() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        String listagemAcompanhamento;
        AcompanhamentoDAO acompanhamentoDAO = new AcompanhamentoDAO();
        rs = acompanhamentoDAO.listarAcompanhamento();
        
        listagemAcompanhamento = rs.toString();
        
        return listagemAcompanhamento;
    }
    //
    //Metodos de alteração
    //
    public void receberDoaçãoAtualizar(Doação doação, String animalBusca) throws ClassNotFoundException, SQLException {
        DoaçãoDAO doaDAO = new DoaçãoDAO();
        doaDAO.alterarDadosDoação(doação, animalBusca);
    }
    
    public void receberAnimalAtualizar(Animal animal, String animalBusca) throws ClassNotFoundException, SQLException {
        AnimalDAO aniDAO = new AnimalDAO();
        aniDAO.alterarDadosAnimal(animal, animalBusca);
    }
    
    public void receberAcompanhamentoAtualizar(Acompanhamento acompanhamento, String acompanhamentoBusca) throws ClassNotFoundException, SQLException {
        AcompanhamentoDAO acompDAO = new AcompanhamentoDAO();
        acompDAO.alterarDadosAcompanhamento(acompanhamento, acompanhamentoBusca);
    }
    
    public void receberDoadorAtualizar(Doador doador, String doadorBusca) throws ClassNotFoundException, SQLException {
        DoadorDAO doaDAO = new DoadorDAO();
        doaDAO.alterarDadosDoador(doador, doadorBusca);
    }
    
    public void receberReceptorAtualizar(Receptor receptor, String receptorBusca) throws ClassNotFoundException, SQLException {
        ReceptorDAO recepDAO = new ReceptorDAO();
        recepDAO.alterarDadosReceptor(receptor, receptorBusca);
    }
    
    //
    //Métodos de exclusão
    //
    public void receberExcluirDoação(String animal) throws SQLException, ClassNotFoundException{
        DoaçãoDAO doaçãoExcluirDAO = new DoaçãoDAO();
        doaçãoExcluirDAO.excluirDoação(animal);
    }
    
    public void receberExcluirAnimal(String animal) throws SQLException, ClassNotFoundException{
        AnimalDAO animalExcluirDAO = new AnimalDAO();
        animalExcluirDAO.excluirAnimal(animal);
    }
    
    public void receberExcluirAcompanhamento(String acompanhamento) throws SQLException, ClassNotFoundException{
        AcompanhamentoDAO acompanhamentoExcluirDAO = new AcompanhamentoDAO();
        acompanhamentoExcluirDAO.excluirAcompanhamento(acompanhamento);
    }
    
    public void receberExcluirDoador(String doador) throws SQLException, ClassNotFoundException{
        DoadorDAO doadorExcluirDAO = new DoadorDAO();
        doadorExcluirDAO.excluirDoador(doador);
    }
    
    public void receberExcluirReceptor(String receptor) throws SQLException, ClassNotFoundException{
        ReceptorDAO receptorExcluirDAO = new ReceptorDAO();
        receptorExcluirDAO.excluirReceptor(receptor);
    }
    
}//fim da classe


