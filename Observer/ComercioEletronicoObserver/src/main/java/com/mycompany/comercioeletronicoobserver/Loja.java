package com.mycompany.comercioeletronicoobserver;

import java.util.ArrayList;

public class Loja implements Subject{
    ArrayList<Observer> observers;
    private String nome; // nome do produto

    public Loja() {
        this.observers = new ArrayList();
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println("Item " + nome + " agora"
        + " esta disponivel na loja");
        
        for(Observer o : observers){
            o.update(nome);
        }
    }
    
    public void setNovoProduto(String nome){
        this.nome = nome;
        notifyObserver();
    }
    
    
}
