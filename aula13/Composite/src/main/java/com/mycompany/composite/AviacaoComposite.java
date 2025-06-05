package com.mycompany.composite;

public class AviacaoComposite {

    public static void main(String[] args) {
        
        // Trecho Simples
        TrechoAereo t1 = new TrechoAereoSimples("Guaruja", "Fortaleza", 2000, 400);
        TrechoAereo t2 = new TrechoAereoSimples("Fortaleza", "Natal", 1500, 200);
        
        //Trecho Aereo com Escala
        System.out.println("Trecho Aereo com Escala!");
        TrechoAereo escala = new TrechoAereoComEscala(t1, t2);
        System.out.println(escala.getOrigem());
        System.out.println(escala.getDestino());
        System.out.println(escala.getCusto());
        System.out.println(escala.getDistancia());
        
        //Trecho Aereo com Escala com Aeroportos Diferentes
        t1 = new TrechoAereoSimples("Guarulhos", "Brasilia", 200, 400);
        t2 = new TrechoAereoSimples("Fortaleza", "Natal", 150, 200);
        
        escala = new TrechoAereoComEscala(t1, t2);
        System.out.println(escala.getOrigem());
        System.out.println(escala.getDestino());
        System.out.println(escala.getCusto());
        System.out.println(escala.getDistancia()); 
        
        //Trecho Aereo Com Conexao
        System.out.println("Trecho Aereo com Conhexao");
        t1 = new TrechoAereoSimples("Guarulhos", "Brasilia", 200, 400);
        t2 = new TrechoAereoSimples("Fortaleza", "Natal", 150, 200);
        
        TrechoAereo escala1 = new TrechoAereoComConexao(t1, t2, 50);
        System.out.println(escala1.getOrigem());
        System.out.println(escala1.getDestino());
        System.out.println(escala1.getCusto());
        System.out.println(escala1.getDistancia()); 
        
        //Trecho Aereo Com escala e Conhexao
        System.out.println("Trecho Aereo com Conhexao");
        t1 = new TrechoAereoSimples("Guarulhos", "Brasilia", 200, 400);
        t2 = new TrechoAereoSimples("Fortaleza", "Natal", 150, 200);
        TrechoAereo escala2 = new TrechoAereoComEscala(t1, t2);
        TrechoAereo t3 = new TrechoAereoSimples("Natal", "Brasilia", 350, 300);
        TrechoAereo conexao1 = new TrechoAereoComConexao(escala2, t3, 50);

        System.out.println(conexao1.getOrigem());
        System.out.println(conexao1.getDestino());
        System.out.println(conexao1.getCusto());
        System.out.println(conexao1.getDistancia()); 
   }
}
