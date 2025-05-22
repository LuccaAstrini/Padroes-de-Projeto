package com.mycompany.casabuilder;

public class Casa_Builder {

    public static void main(String[] args) {
        
        Director director = new Director();
        
        //Construção de uma cabana
        HutBuilder hutbuilder = new HutBuilder();
        director.buildHouse(hutbuilder);
        
        House house = hutbuilder.getResult();
        System.out.println(house.print());
        
        //Construção de um Castelo
        CastleBuilder castle = new CastleBuilder();
        director.buildHouse(castle);
        
        house = castle.getResult();
        System.out.println(house.print());
     
        //Contrução de uma casa Normal
        NormalBuilder casa = new NormalBuilder();
        director.buildHouse(casa);
        
        house = casa.getResult();
        System.out.println(house.print());
    }
}
