package model;
/**
 * Classe criada para o cadastro de pessoas no sistema de doação de animais
 * @author Guilherme Bernardelli
 * @since iniciada em 30/03/2016
 */

public class Pessoa{
        
    private String nome;
    private String endereço;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String telefoneCelular;
    private String telefoneOutro;
    private String cpf;
    private String rg;
                
    public Pessoa(){}
        
    public Pessoa(String nome, String endereço, String numero, String complemento, String bairro, String cidade, String estado, String telefone, String telefoneCelular, String telefoneOutro, String cpf, String rg){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefoneCelular = telefoneCelular;
        this.telefoneOutro = telefoneOutro;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereço(){
        return endereço;
    }
    
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefoneCelular(){
        return telefoneCelular;
    }
    
    public void setTelefoneCelular(String telefoneCelular){
        this.telefoneCelular = telefoneCelular;
    }
    
    public String getTelefoneOutro(){
        return telefoneOutro;
    }
    
    public void setTelefoneOutro(String telefoneOutro){
        this.telefoneOutro = telefoneOutro;
    }
    
    public String getRg(){
        return rg;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
