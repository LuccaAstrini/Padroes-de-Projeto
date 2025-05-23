package com.mycompany.pizzariabuilder;

public class PizzaMargueritaBuilder extends PizzaBuilder{
    
    @Override
    public void defineTipoPizza() {
        pizza.defineTipoPizza("Marguerita");
    }

    @Override
    public void defineTamPiza(String tamPizza) {
        pizza.defineTamPizza(tamPizza);
    }

    @Override
    public void defineMassa() {
            pizza.defineMassa("fina");
    }

    @Override
    public void defineMolho() {
        pizza.defineMolho("Tomate");
    }

    @Override
    public void defineCobertura() {
        pizza.defineCobertura("tomate+oregano");
    }
    
}
