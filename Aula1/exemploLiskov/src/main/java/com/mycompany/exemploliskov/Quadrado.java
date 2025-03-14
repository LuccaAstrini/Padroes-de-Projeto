/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploliskov;

/**
 *
 * @author android
 */
public class Quadrado extends Retangulo implements FormaGeometrica {

    // @Override
    // public void setAltura(double largura){
    //    super.setAltura(largura);
    //    super.setLargura(largura);
    //}
    // @Override
    // public void setLargura(double altura){
    //    super.setAltura(altura);
    //     super.setLargura(altura);
    //}
    private double lado;

    public Quadrado(double largura, double altura) {
        super(largura, altura);
    }

    public double Quadrado(double lado) {
        return this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
