package model;

import java.sql.Date;

/**
 * Classe criada para acompanhamento ao longo do processo de adoção de animais
 * @author Guilherme Bernardelli
 * @since iniciada em 31/03/2016
 */
public class Acompanhamento {
    
    private String animal;
    private String codigo;
    private boolean emAcompanhamento;
    private String ultimaVisita;
    private String proximaVisita;
    private String ultimaVacina;
    private String proximaVacina;
    private boolean condiçãoVacinas;
    private boolean condiçãoAtual;
    private boolean condiçãoAlimentação;
    private boolean condiçãoLocal;
    private boolean condiçãoLimpeza;
    private String dataInicio;
    private String dataFinal;
    
    public Acompanhamento(){}
    
    public Acompanhamento(String animal, String codigo, boolean emAcompanhamento, String ultimaVisita, String proximaVisita, String ultimaVacina, String proximaVacina, boolean condiçãoVacinas, boolean condiçãoAtual, boolean condiçãoAlimentação, boolean condiçãoLocal, boolean condiçãoLimpeza, String dataInicio, String dataFinal){
        this.animal = animal;
        this.codigo = codigo;
        this.emAcompanhamento = emAcompanhamento;
        this.ultimaVisita = ultimaVisita;
        this.proximaVisita = proximaVisita;
        this.ultimaVacina = ultimaVacina;
        this.proximaVacina = proximaVacina;
        this.condiçãoVacinas = condiçãoVacinas;
        this.condiçãoAtual = condiçãoAtual;
        this.condiçãoAlimentação = condiçãoAlimentação;
        this.condiçãoLocal = condiçãoLocal;
        this.condiçãoLimpeza = condiçãoLimpeza;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }
    
    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    public String getAnimal(){
        return animal;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setEmAcompanhamento(boolean emAcompanhamento){
        this.emAcompanhamento = emAcompanhamento;
    }
    
    public boolean isEmAcompanhamento(){
        return emAcompanhamento;
    }
    
    public void setUltimaVisita(String ultimaVisita){
        this.ultimaVisita = ultimaVisita;
    }
    
    public String getUltimaVisita(){
        return ultimaVisita;
    }
    
    public void setProximaVisita(String proximaVisita){
        this.proximaVisita = proximaVisita;
    }
    
    public String getProximaVisita(){
        return proximaVisita;
    }
    
    public void setUltimaVacina(String ultimaVacina){
        this.ultimaVacina = ultimaVacina;
    }
    
    public String getUltimaVacina(){
        return ultimaVacina;
    }
    
    public void setProximaVacina(String proximaVacina){
        this.proximaVacina = proximaVacina;
    }
    
    public String getProximaVacina(){
        return proximaVacina;
    }
    
    public void setCondiçãoVacinas(boolean condiçãoVacinas){
        this.condiçãoVacinas = condiçãoVacinas;
    }
    
    public boolean isCondiçãoVacinas(){
        return condiçãoVacinas;
    }
    
    public void setCondiçãoAtual(boolean condiçãoAtual){
        this.condiçãoAtual = condiçãoAtual;
    }
    
    public boolean isCondiçãoAtual(){
        return condiçãoAtual;
    }
    
    public void setCondiçãoAlimentação(boolean condiçãoAlimentação){
        this.condiçãoAlimentação = condiçãoAlimentação;
    }
    
    public boolean isCondiçãoAlimentação(){
        return condiçãoAlimentação;
    }
    
    public void setCondiçãoLocal(boolean condiçãoLocal){
        this.condiçãoLocal = condiçãoLocal;
    }
    
    public boolean isCondiçãoLocal(){
        return condiçãoLocal;
    }
    
    public void setCondiçãoLimpeza(boolean condiçãoLimpeza){
        this.condiçãoLimpeza = condiçãoLimpeza;
    }
    
    public boolean isCondiçãoLimpeza(){
        return condiçãoLimpeza;
    }
    
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    
    public String getDataInicio(){
        return dataInicio;
    }
    
    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }
    
    public String getDataFinal(){
        return dataFinal;
    }
}
