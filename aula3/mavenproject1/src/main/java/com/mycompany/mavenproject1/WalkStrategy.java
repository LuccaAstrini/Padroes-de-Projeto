/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author android
 */
public class WalkStrategy implements RouteStrategy{

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Road Strategy" + a + "and" + b);
    }
    
}
