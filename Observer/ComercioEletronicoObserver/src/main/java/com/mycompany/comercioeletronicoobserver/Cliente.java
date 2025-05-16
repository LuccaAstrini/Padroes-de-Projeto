package com.mycompany.comercioeletronicoobserver;

public class Cliente implements Observer{
    
    private String email;

    public Cliente(String email) {
        this.email = email;
    }

    @Override
    public void update(String nome) {
        System.out.println("Enviando e-mail para o cliente " + email+
                " sobre o produto " + nome);
    }
    
    
    
}
