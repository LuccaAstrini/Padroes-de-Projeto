package com.mycompany.geracaorelatoriopdf;

public class LogisticsReportBuilder implements ReportBuilder {

    private Report report = new Report();

    @Override
    public void buildCustomerInfo() {
        System.out.println("Nome: João da Silva\nEmpresa: Transportes XYZ");
    }

    @Override
    public void buildDeliveries() {
        report.setDeliveries("1.Encomenda 123 - Entregue\n2-Encomenta 456 - Em transito");
    }

    @Override
    public void buildStatics() {
        report.setStatics("Total de Entregas: 25\n Atrasos: 2\n Pontual: 92%");
    }

    @Override
    public void buildConclusion() {
        report.setConclusion("Todas as entregas estão dentro do SLA");
    }

    @Override
    public Report getReport() {
        return this.report;
    }

}
