package com.mycompany.jogo_de_adivinhachao;

import java.util.Scanner;

public abstract class JogoAdivinha {

    protected int numeroSecreto;
    Scanner sc = new Scanner(System.in);

    public final void jogar() {
        InicializarJogo();
        int palpite;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número!");

        while (!acertou) {
            System.out.print("Seu palpite: ");
            palpite = sc.nextInt();
            acertou = FornecerFeedback(palpite);
        }

        System.out.println("Parabéns! Você acertou!");
    }

    public abstract void InicializarJogo();

    public abstract boolean FornecerFeedback(int palpite);

}
