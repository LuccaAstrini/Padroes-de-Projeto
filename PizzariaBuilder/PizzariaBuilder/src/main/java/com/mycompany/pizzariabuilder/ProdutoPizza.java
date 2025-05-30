package com.mycompany.pizzariabuilder;

public class ProdutoPizza {
    
    //Campos definidos pelo garçom
    private String tipoPizza = "";
    private String tamPizza = "";
    
    //campos intrisecos ao tipo de pizza
    private String massa = "";
    private String molho = "";
    private String cobertura = "";
    
    public void defineTipoPizza(String tipoPizza){
        this.tipoPizza = tipoPizza;
    }
    
    public void defineTamPizza(String tamPizza){
        this.tamPizza = tamPizza;
    }
    
    public void defineMassa(String massa){
        this.massa = massa;
    }
    
    public void defineMolho(String molho){
        this.molho = molho;
    }
    
    public void defineCobertura(String cobertura){
        this.cobertura = cobertura;
    }
    
    public String getTipoProdutoPizza(){
        return tipoPizza;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public String getTamPizza() {
        return tamPizza;
    }

    public String getMassa() {
        return massa;
    }

    public String getMolho() {
        return molho;
    }

    public String getCobertura() {
        return cobertura;
    }
    
    
    
    public void exibePizza(){
        System.out.println("Pizza: " + getTipoProdutoPizza()+
                "\n Tamanho: "+ getTamPizza() +
                "\n Massa: " + getMassa()+
                "\nMolho: " + getMolho() +
                "\nCobertura: " + getCobertura());
    }
    
}
