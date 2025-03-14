/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploliskov;

public class Retangulo implements FormaGeometrica{

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    //public double getLargura() {
    //     return largura;
    // }
    // public void setLargura(double largura) {
    //     this.largura = largura;
    // }
    // public double getAltura() {
    //     return altura;
    // }
    // public void setAltura(double altura) {
    //     this.altura = altura;
    //}
    public double getArea() {
        return altura * largura;
    }
}
