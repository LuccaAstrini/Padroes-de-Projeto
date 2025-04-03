package com.mycompany.abstractmethod;

public class ArtDecoFunitureFacotry implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }

}
