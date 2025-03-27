package com.mycompany.factorymethod;

public abstract class LojaPizza {
    
    public Pizza orderPizza(String tipo){
        Pizza pizza;
        pizza = criarPizza(tipo);
        
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.box();
        
        return pizza;
    }
    
    public abstract Pizza criarPizza(String tipo);
        
}
