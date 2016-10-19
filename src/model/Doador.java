package model;
/**
 * Classe criada para para herdar atributos e métodos de pessoa e tratar  
 * @author Guilherme Bernardelli
 * @since inciada em 01/04/2016
 */
public class Doador extends Pessoa {
    
    private String animaisDoados;
    private String quantosAnimais;
    
    public Doador(){}
        
    public Doador(String nome, String endereço, String numero, String complemento, String bairro, String cidade, String estado, String telefone, String telefoneCelular, String telefoneOutro, String cpf, String rg, String animaisDoados, String quantosAnimais){
        
        super( nome, endereço, numero, complemento, bairro, cidade, estado, telefone, telefoneCelular, telefoneOutro, cpf, rg);
    }  
    
    public String getAnimaisDoados(){
        return animaisDoados;
    }
        
    public void setAnimaisDoados(String animaisDoados){
        this.animaisDoados = animaisDoados;
    }
        
    public String getQuantosAnimais(){
        return quantosAnimais;
    }
        
    public void setQuantosAnimais(String quantosAnimais){
        this.quantosAnimais = quantosAnimais;
    }
}

    

