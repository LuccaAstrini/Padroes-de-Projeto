package com.mycompany.jogo_de_adivinhachao;

import static java.lang.Math.random;

public class JogoDificil extends JogoAdivinha{
    
    @Override
    public void InicializarJogo() {
        int sortear = (int)(Math.random()*100+1);
        System.out.println("" + sortear);
    }

    @Override
    public void FornecerFeedback(int palpite) {
    
    }
    
}
