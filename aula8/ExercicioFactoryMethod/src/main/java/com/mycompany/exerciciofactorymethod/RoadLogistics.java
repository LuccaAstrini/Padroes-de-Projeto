package com.mycompany.exerciciofactorymethod;

public class RoadLogistics extends Logistic{

    @Override
    public Transport createTransport() {
        return new Truck();
    }
    
    
    
}
