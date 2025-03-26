package com.mycompany.jogo_de_adivinhachao;

import static java.lang.System.out;
import java.util.Scanner;

public class Jogo_de_Adivinhachao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoAdivinha jogo;

        System.out.println("Escolha a dificuldade: \n1 - Fácil (1 a 10)\n2 - Difícil (1 a 100)");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            jogo = new JogoFacil();
        } else if (escolha == 2) {
            jogo = new JogoDificil();
        } else {
            System.out.println("Opção inválida. Tente novamente.");
            return;
        }

        jogo.jogar();  // Inicia o jogo
        sc.close();
    }
}
