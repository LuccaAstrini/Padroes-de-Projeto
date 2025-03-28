package com.mycompany.factorymethodcreator;

public abstract class Creator {
    
    public void SomeOperations(){
        
    }
    
    public void createSow(){
        Product product = this.factoryMethod();
            System.out.println(product);
    }
    
    public abstract Product factoryMethod();
    
}
