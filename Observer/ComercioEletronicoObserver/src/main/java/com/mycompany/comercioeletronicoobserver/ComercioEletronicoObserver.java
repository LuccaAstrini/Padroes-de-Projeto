package com.mycompany.comercioeletronicoobserver;

public class ComercioEletronicoObserver {

    public static void main(String[] args) {
        
        Loja loja = new Loja();
        
        Cliente c1 = new Cliente("lucca.astrini@gmail.com");
        Cliente c2 = new Cliente("lucca.astrini@sou.fae.br");
        
        loja.addObserver(c1);
        loja.addObserver(c2);
        
        loja.setNovoProduto("Iphone17");
        
        System.out.println("");
        
        loja.removeObserver(c2);
        
        loja.setNovoProduto("RTX 8026UltraSuperRapido");
        
    }
}
