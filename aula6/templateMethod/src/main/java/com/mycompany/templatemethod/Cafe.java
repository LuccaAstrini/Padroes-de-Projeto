package com.mycompany.templatemethod;

public class Cafe extends Bebida{

    @Override
    public void infusao() {
        System.out.println("Colocar o café na água fervendo.");  
    }

    @Override
    public void adicionarCondimentos() {
       System.out.println("Adicionar açicar.");
    }
    
}
