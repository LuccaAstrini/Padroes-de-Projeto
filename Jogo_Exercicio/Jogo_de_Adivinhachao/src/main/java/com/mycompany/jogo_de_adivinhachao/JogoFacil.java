package com.mycompany.jogo_de_adivinhachao;

public class JogoFacil extends JogoAdivinha {

    @Override
    public void InicializarJogo() {
        numeroSecreto = (int) (Math.random() * 10 + 1);
        System.out.println("Número sorteado! (entre 1 e 10)");
    }

    @Override
    public boolean FornecerFeedback(int palpite) {
        if (palpite == numeroSecreto) {
            return true;
        } else if (palpite < numeroSecreto) {
            System.out.println("O número é maior!");
        } else {
            System.out.println("O número é menor!");
        }
        return false;
    }

}
