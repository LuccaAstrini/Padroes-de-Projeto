package com.mycompany.factorymethod;

public class LojaSaoJoao extends LojaPizza {

    @Override
    public Pizza criarPizza(String tipo) {
        if(tipo.equals("Mussarela")){
            return new SJMussarela();
        }else if (tipo.equals("Marguerita")){
            return new SJMarguerita();
        }
        return null;
    }

}
