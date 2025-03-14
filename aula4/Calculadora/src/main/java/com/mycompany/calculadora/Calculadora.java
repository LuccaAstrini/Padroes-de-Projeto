/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author android
 */
public class Calculadora {

    public static void main(String[] args) {
        Calcular c = new Calcular();
        c.setOperacao(new Somar());
        c.CalcularOperacao(10, 5);
        
        c.setOperacao(new Divisao());
        c.CalcularOperacao(10, 5);
        
        c.setOperacao(new Subtracao());
        c.CalcularOperacao(10, 5);
        
        c.setOperacao(new Multiplicacao());
        c.CalcularOperacao(10, 5);
        
    }
}
