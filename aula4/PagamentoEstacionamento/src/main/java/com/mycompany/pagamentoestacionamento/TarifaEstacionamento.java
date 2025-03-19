package com.mycompany.pagamentoestacionamento;

public class TarifaEstacionamento {
     private int qtdHoras;
    private Calculo calculo;

    public TarifaEstacionamento(int qtdHoras, Calculo calculo) {
        this.qtdHoras = qtdHoras;
        this.calculo = calculo;
    }

    public float calcularTarifa() {
        return calculo.calcularTarifas(qtdHoras);
    }
}
