package model;

import java.sql.Date;

/**
 * Classe criada para controle de doação de animais
 * @author Guilherme Bernardelli
 * @since iniciada em 31/03/2016
 */
public class Doação{
    
    private Date data_doação;
    private String receptor;
    private String animal;
    private String doador;
    private int codigoAcompanhamento;

    public Doação(){}

    public Doação(Date data_doação, String receptor, String animal, String doador, int codigoAcompanhamento){
        this.data_doação = data_doação;
        this.receptor = receptor;
        this.animal = animal;
        this.doador = doador;
        this.codigoAcompanhamento = codigoAcompanhamento;
    }
    
    public void setDataDoação(Date data_doação){
        this.data_doação = data_doação;
    }
    
    public Date getDataDoação(){
        return data_doação;
    }
    
    public void setReceptor(String receptor){
        this.receptor = receptor;
    }
    
    public String getReceptor(){
        return receptor;
    }
    
    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    public String getAnimal(){
        return animal;
    }
    
    public void setDoador(String doador){
        this.doador = doador;
    }
    
    public String getDoador(){
        return doador;
    }
    
    public void setCodigoAcompanhamento(int codigoAcompanhamento){
        this.codigoAcompanhamento = codigoAcompanhamento;
    }
    
    public int getCodigoAcompanhamento(){
        return codigoAcompanhamento;
    }
}