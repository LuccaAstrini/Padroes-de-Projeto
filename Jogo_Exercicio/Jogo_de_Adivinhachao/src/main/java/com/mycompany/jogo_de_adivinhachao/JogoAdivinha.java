package com.mycompany.jogo_de_adivinhachao;

public abstract class JogoAdivinha {
    
    int palpite;
    
    public final void jogar(){
        InicializarJogo();   
        FornecerFeedback(palpite);
    }
    
    public abstract void InicializarJogo();

    public abstract void FornecerFeedback(int palpite);
    
}
