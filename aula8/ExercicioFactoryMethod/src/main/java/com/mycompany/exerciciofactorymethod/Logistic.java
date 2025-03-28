package com.mycompany.exerciciofactorymethod;

public abstract class Logistic {
    
    public void planDelivery(){
        Transport transport = this.createTransport();
        System.out.println(transport);
    }
    
    public abstract Transport createTransport(); 
}
