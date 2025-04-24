package com.mycompany.teteimpressoes;

public class TesteImpressoes {

    public static void main(String[] args) {
        Impressora imp = Impressora.getInstance("HP");
        imp.exibirImpressora();
    }
}
