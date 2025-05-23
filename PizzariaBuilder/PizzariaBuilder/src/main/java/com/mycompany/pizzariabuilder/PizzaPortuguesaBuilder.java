package com.mycompany.pizzariabuilder;

public class PizzaPortuguesaBuilder extends PizzaBuilder{
    
    @Override
    public void defineTipoPizza() {
        pizza.defineTipoPizza("Portuguesa");
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
        pizza.defineMolho("Não apimentado");
    }

    @Override
    public void defineCobertura() {
        pizza.defineCobertura("ovo+azeitona");
    }
    
}
