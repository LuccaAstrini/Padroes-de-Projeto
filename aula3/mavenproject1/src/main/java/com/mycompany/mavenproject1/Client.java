/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author android
 */
public class Client {

    public static void main(String[] args) {
        
        String A = "Local A";
        String B = "Local B";
        
        Navigator navigator = new Navigator();
        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute(A, B);
        
        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute(A, B);
    }
}
