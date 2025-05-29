package com.mycompany.geracaorelatoriopdf;

public class ReportDirector {

    private ReportBuilder builder;

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public Report buildMinimalReport() {
        builder.buildCustomerInfo();
        builder.buildDeliveries();
        return builder.getReport();
    }

    public Report buildFullReport() {
        builder.buildCustomerInfo();
        builder.buildDeliveries();
        builder.buildStatics();
        builder.buildConclusion();
        return builder.getReport();
    }

}
