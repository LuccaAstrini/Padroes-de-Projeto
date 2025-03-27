package com.mycompany.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
    
    protected String nome;
    protected String massa;
    protected String molho;
    protected String temperatura;
    protected int tempo;
    ArrayList coberturas = new ArrayList();
    
    public void preparar(){
        System.out.println("Preparando "+nome);
        System.out.println("Amassandi "+massa);
        System.out.println("Adicionando "+molho);
        System.out.println("Temperatura "+temperatura);
        System.out.println("Tempo "+tempo);
        
        System.out.println("Adicionando Coberturas: "+coberturas);
        for(int i = 0; i<coberturas.size(); i++){
            System.out.println(" "+coberturas.get(i));
        }
    }
    
    public void assar(){
        System.out.println("Assando por 5 minutos");
    }
    
    public void cortar(){
        System.out.println("Cortando a pizza em fatias");
    }
    
    public void box(){
        System.out.println("Colocando a pizza na caixa");
    }
    
    public String getNome(){
        return nome;
    }
    
}
