package com.mycompany.jogo_de_adivinhachao;

public class JogoFacil extends JogoAdivinha {

    @Override
    public void InicializarJogo() {
        int sortear = 0;
        while (sortear != 10 || sortear != 0){
            sortear = (int)(Math.random()*10+1);
            System.out.println("" + sortear);
        }
        

    }

    @Override
    public void FornecerFeedback(int palpite) {
    
    }

}
