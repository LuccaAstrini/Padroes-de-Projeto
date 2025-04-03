package com.mycompany.abstractmethod;

public class ModernFurnitureFactory implements FurnitureFactory{
    
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }
}
