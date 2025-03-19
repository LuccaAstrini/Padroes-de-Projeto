package com.mycompany.pagamentoestacionamento;

public class PagamentoEstacionamento {

    public static void main(String[] args) {
        Calculo calculoHora = new CalculoHora(5);
        TarifaEstacionamento tarifaHora = new TarifaEstacionamento(3, calculoHora);
        System.out.println("Tarifa por Hora: " + tarifaHora.calcularTarifa());

        Calculo calculoDiaria = new CalculoDiaria(60);
        TarifaEstacionamento tarifaDiaria = new TarifaEstacionamento(25, calculoDiaria);
        System.out.println("Tarifa Diária: " + tarifaDiaria.calcularTarifa());
    }
}
