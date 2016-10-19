package model;
/**
 * Classe criada com herança da classe pessoa utilizada para cadastrar doações de animais
 * @author Guilherme Bernardelli
 * @since 30/03/2016
 */
public class Receptor extends Pessoa{
    
    private String animaisRecebidos;
    private String quantosAnimais;
    private String espaçoDisponivel;
    private boolean podeReceber;
    private String nota;
    
    public Receptor(){}
    
    public Receptor(String nome, String endereço, String numero, String complemento, String bairro, String cidade, String estado, String telefone, String telefoneCelular, String telefoneOutro, String cpf, String rg, String animaisRecebidos, String quantosAnimais, String espaçoDisponivel, String podeReceber, String nota){
        
        super( nome, endereço, numero, complemento, bairro, cidade, estado, telefone, telefoneCelular, telefoneOutro, cpf, rg);
        
    }
    public String getAnimaisRecebidos(){
        return animaisRecebidos;
    }
        
    public void setAnimaisRecebidos(String animaisRecebidos){
        this.animaisRecebidos = animaisRecebidos;
    }
    
    public String getQuantosAnimais(){
        return quantosAnimais;
    }
        
    public void setQuantosAnimais(String quantosAnimais){
        this.quantosAnimais = quantosAnimais;
    }
    
    public String getEspaçoDisponivel(){
        return espaçoDisponivel;
    }
        
    public void setEspaçoDisponivel(String espaçoDisponivel){
        this.espaçoDisponivel = espaçoDisponivel;
    }
    
    public boolean isPodeReceber(){
        return podeReceber;
    }
        
    public void setPodeReceber(boolean podeReceber){
        this.podeReceber = podeReceber;
    }
    
    public String getNota(){
        return nota;
    }
        
    public void setNota(String nota){
        this.nota = nota;
    }
}
