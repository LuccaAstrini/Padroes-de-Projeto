package com.mycompany.factorymethod;

public class LojaPocosCaldas extends LojaPizza{
    
    @Override
    public Pizza criarPizza(String tipo) {
        if(tipo.equals("Mussarela")){
            return new PocosMussarela();
        }else if (tipo.equals("Marguerita")){
            return new PocosMarguerita();
        }
        return null;
    }
    
}
