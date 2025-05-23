package com.mycompany.pizzariabuilder;

public class GarcomDiretor {
    
    private PizzaBuilder pizzaBuilder;
    
    public GarcomDiretor definePizzaBuilder(PizzaBuilder pizzaBuilder){
        //associa PizzaBuilder
        this.pizzaBuilder = pizzaBuilder;
        
        //retorna o objeto GarcomDiretor
        return this;
    }
    
    public ProdutoPizza montaPizza(String tamPizza){
       pizzaBuilder.criaNovoProdutoPizza();
       pizzaBuilder.defineTipoPizza();
       pizzaBuilder.defineTamPiza(tamPizza);
       pizzaBuilder.defineMassa();
       pizzaBuilder.defineMolho();
       pizzaBuilder.defineCobertura();
       
       return pizzaBuilder.getPizza();
       
    }
    
}
