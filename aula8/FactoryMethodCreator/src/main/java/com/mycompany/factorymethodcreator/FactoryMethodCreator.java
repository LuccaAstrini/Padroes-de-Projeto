package com.mycompany.factorymethodcreator;

public class FactoryMethodCreator {

    public static void main(String[] args) {
        
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.print();
        creator.createSow();
        
        
        
    }
}
