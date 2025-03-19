package com.mycompany.pagamentoestacionamento;

public class CalculoHora implements Calculo{

    private int valorHora;

    public CalculoHora(int valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularTarifas(int qtdHoras) {
        return qtdHoras * valorHora;
    } 
}
