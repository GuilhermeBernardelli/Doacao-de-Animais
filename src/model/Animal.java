package model;

//import javax.swing.Icon;

/**
 * Classe criada para cadastro de animais para doação
 * @author Guilherme Bernardelli
 * @since iniciada em 31/03/2016
 */
public class Animal {
    
    private String nome;
    private int codigo;
    private String animal;
    private int registro;
    private String corPrimaria;
    private String raça;
    private String pedigree;
    private boolean octupla;
    private boolean quintupla;
    private boolean giardiase;
    private boolean antirrabica;
    private boolean gripeCanina;
    private boolean outras;
    private String outrasDetalhe;
    private String saudavel;
    private int nota;
    private String localAtual;
    //private byte[] imagem1;
    //private byte[] imagem2;
    
    public Animal(){}
    
    public Animal(String nome, int codigo, String animal, int registro, String corPrimaria, String raça, String pedigree, boolean octupla, boolean quintupla, boolean giardiase, boolean antirrabica, boolean gripeCanina, boolean outras, String outrasDetalhe, String saudavel, int nota, String localAtual){
            //, byte[] imagem1, byte[] imagem2){
    this.nome = nome;
    this.codigo = codigo;
    this.animal = animal;
    this.registro = registro;
    this.corPrimaria = corPrimaria;
    this.raça = raça ;
    this.pedigree = pedigree;
    this.octupla = octupla;
    this.quintupla = quintupla;
    this.giardiase = giardiase;
    this.antirrabica = antirrabica;
    this.gripeCanina = gripeCanina;
    this.outras = outras;
    this.outrasDetalhe = outrasDetalhe;
    this.saudavel = saudavel;
    this.nota = nota;
    this.localAtual = localAtual;
    //this.imagem1 = imagem1;
    //this.imagem2 = imagem2;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getAnimal(){
        return animal;
    }
    
    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    public int getRegistro(){
        return registro;
    }
    
    public void setRegistro(int registro){
        this.registro = registro;
    }
   
    public String getCorPrimaria(){
        return corPrimaria;
    }
    
    public void setCorPrimaria(String corPrimaria){
        this.corPrimaria = corPrimaria;
    }
    
    public String getRaça(){
        return raça;
    }
    
    public void setRaça(String raça){
        this.raça = raça;
    }
    
    public String getPedigree(){
        return pedigree;
    }
    
    public void setPedigree(String pedigree){
        this.pedigree = pedigree;
    }
    
    public boolean isOctupla(){
        return octupla;
    }
    
    public void setOctupla(boolean octupla){
        this.octupla = octupla;        
    }
    
    public boolean isQuintupla(){
        return quintupla;
    }
    
    public void setQuintupla(boolean quintupla){
        this.quintupla = quintupla;        
    }
    
    public boolean isGiardiase(){
        return giardiase;
    }
    
    public void setGiardiase(boolean giardiase){
        this.giardiase = giardiase;        
    }
    
    public boolean isAntirrabica(){
        return antirrabica;
    }
    
    public void setAntirrabica(boolean antirrabica){
        this.antirrabica = antirrabica;        
    }
    
    public boolean isGripeCanina(){
        return gripeCanina;
    }
    
    public void setGripeCanina(boolean gripeCanina){
        this.gripeCanina = gripeCanina;        
    }
    
    public boolean isOutras(){
        return outras;
    }
    
    public void setOutras(boolean outras){
        this.outras = outras;        
    }
    
    public String getOutrasDetalhe(){
        return outrasDetalhe;
    }
    
    public void setOutrasDetalhe(String outrasDetalhe){
        this.outrasDetalhe = outrasDetalhe;        
    }
    
    public String getSaudavel(){
        return saudavel;
    }
    
    public void setSaudavel(String saudavel){
        this.saudavel = saudavel;
    }
    
    public int getNota(){
        return nota;
    }
    
    public void setNota(int nota){
        this.nota = nota;        
    }
    
    public String getLocalAtual(){
        return localAtual;
    }
    
    public void setLocalAtual(String localAtual){
        this.localAtual = localAtual;
    }
    /*
    public byte[] getImagem1(){
        return imagem1;
    }
    
    public void setImagem1(byte[] imagem1){
        this.imagem1 = imagem1;
    }
    
    public byte[] getImagem2(){
        return imagem2;
    }
    
    public void setImagem2(byte[] imagem2){
        this.imagem2 = imagem2;
    }
    */
}

