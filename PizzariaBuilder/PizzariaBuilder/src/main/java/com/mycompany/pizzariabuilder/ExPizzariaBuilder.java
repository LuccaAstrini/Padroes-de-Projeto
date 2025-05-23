package com.mycompany.pizzariabuilder;

public class ExPizzariaBuilder {

    public static void main(String[] args) {
        
        //1-Cria Diretor
        GarcomDiretor garcom = new GarcomDiretor();
        
        //Teste 1 - Cria pizza Portuguesa
        PizzaBuilder portuguesa = new PizzaPortuguesaBuilder();
        garcom.definePizzaBuilder(portuguesa);
        ProdutoPizza pp = garcom.montaPizza("pequena");
        pp.exibePizza();
        
        //Teste 2 - Cria pizza Italiana
        PizzaBuilder italiana = new PizzaItalianaBuilder();
        garcom.definePizzaBuilder(italiana);
        ProdutoPizza pp2 = garcom.montaPizza("Grande");
        pp2.exibePizza();
        
        //Teste 3 - Cria Pizza Marguerita
        PizzaBuilder marguerita = new PizzaMargueritaBuilder();
        garcom.definePizzaBuilder(marguerita);
        ProdutoPizza pp3 = garcom.montaPizza("Media");
        pp3.exibePizza();
    }
}
