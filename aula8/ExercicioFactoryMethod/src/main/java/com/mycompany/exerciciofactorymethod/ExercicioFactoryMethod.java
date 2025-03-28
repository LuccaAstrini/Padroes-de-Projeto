package com.mycompany.exerciciofactorymethod;

public class ExercicioFactoryMethod {

    public static void main(String[] args) {

        Logistic logi = new RoadLogistics();
        Transport transport = logi.createTransport();
        transport.deliver();
        logi.createTransport();
        
        Logistic ship = new SealLogistics();
        Transport sail = ship.createTransport();
        sail.deliver();
        ship.createTransport();

    }
}
