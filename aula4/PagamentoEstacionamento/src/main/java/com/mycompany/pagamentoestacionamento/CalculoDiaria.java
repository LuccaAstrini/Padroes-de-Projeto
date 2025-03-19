package com.mycompany.pagamentoestacionamento;

public class CalculoDiaria implements Calculo {

    private float valorDiaria;

    public CalculoDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public float calcularTarifas(int qtdHoras) {
        return valorDiaria * (qtdHoras / 24.0f);
    }

}
