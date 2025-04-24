package com.mycompany.teteimpressoes;

public class Impressora {
    private static Impressora instance;
    private String fabricante;

    private Impressora(String fabricante) {
        this.fabricante = fabricante;
    }

    public static Impressora getInstance(String fabricante) {
        if(instance == null){
            instance = new Impressora(fabricante);
        }
        return instance;
    }
    
    public void exibirImpressora(){
        System.out.println("Impressora: "+ this.fabricante);
    }
}
