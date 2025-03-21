package com.mycompany.templatemethod;

public class Cha extends Bebida{

    @Override
    public void infusao() {
        System.out.println("Colocar o chá na água fervendo.");   
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Adicionar limão.");
    }
    
}
