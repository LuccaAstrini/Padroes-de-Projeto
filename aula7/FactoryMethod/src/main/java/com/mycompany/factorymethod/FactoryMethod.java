package com.mycompany.factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {

        LojaPizza lojaSJ = new LojaSaoJoao();
        LojaPizza LojaPocos = new LojaPocosCaldas();

        Pizza pizza = lojaSJ.orderPizza("Mussarela");
        System.out.println("---- " + pizza.getNome() + "----");

        pizza = LojaPocos.orderPizza("Marguerita");
        System.out.println("---- " + pizza.getNome() + "----");

    }
}
