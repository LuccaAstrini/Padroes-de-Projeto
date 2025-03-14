/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author android
 */
public class Navigator {
    private RouteStrategy strategy;
    
    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }
    
    public void buildRoute(String a, String b){
        strategy.buildRoute(a, b);
    }
    
}
