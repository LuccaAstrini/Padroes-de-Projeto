package com.mycompany.pizzariabuilder;

public class PizzaItalianaBuilder extends PizzaBuilder{

    @Override
    public void defineTipoPizza() {
        pizza.defineTipoPizza("Italiana");
    }

    @Override
    public void defineTamPiza(String tamPizza) {
        pizza.defineTamPizza(tamPizza);
    }

    @Override
    public void defineMassa() {
            pizza.defineMassa("Grossa");
    }

    @Override
    public void defineMolho() {
        pizza.defineMolho("Apimentado");
    }

    @Override
    public void defineCobertura() {
        pizza.defineCobertura("peperoni+salame");
    }
    
    
    
}
