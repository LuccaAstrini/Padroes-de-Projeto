package com.mycompany.templatemethod;

public class TemplateMethod {

    public static void main(String[] args) {
        
        Bebida cafe = new Cafe();
        Bebida cha = new Cha();
        
        System.out.println("Fazer café");
        cafe.prepare();
        
        
        System.out.println("\nFazer chá");
        cha.prepare();
    }
}
