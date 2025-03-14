/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author android
 */
public class Calcular {
    
    private Operandos operar;
    
    public void setOperacao(Operandos operar){
        this.operar = operar;
    }
    
    public void CalcularOperacao(float num1, float num2){
        operar.CalcularOperando(num1, num2);
    }
    
}
