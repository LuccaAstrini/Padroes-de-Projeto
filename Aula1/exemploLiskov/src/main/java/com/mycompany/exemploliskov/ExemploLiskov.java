/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploliskov;

/**
 *
 * @author android
 */
public class ExemploLiskov {

    public static void main(String[] args) {
        
       // Retangulo ret = new Retangulo();
        //ret.setAltura(2);
        //ret.setLargura(3);
        //System.out.println("Área do Quadrado: " + ret.getArea());
        
        //Quadrado quad = new Quadrado();
        //quad.setAltura(2);
        //quad.setLargura(3);
        //System.out.println("Área do Quadrado: "+ quad.getArea());
        
       // Retangulo obj1 = new Quadrado();
       // obj1.setAltura(5);
       // obj1.setLargura(10);
        //System.out.println("Área do Quadrado: " + obj1.getArea());
        
        FormaGeometrica quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.getArea());
        
        FormaGeometrica retangulo = new Retangulo(2, 5);
        System.out.println("Área do Retangulo: " + retangulo.getArea());
    }
}
