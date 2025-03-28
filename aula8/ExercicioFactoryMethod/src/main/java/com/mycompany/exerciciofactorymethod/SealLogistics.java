package com.mycompany.exerciciofactorymethod;

public class SealLogistics extends Logistic{
    
    @Override
    public Transport createTransport() {
        return new Ship();
    }
    
}
