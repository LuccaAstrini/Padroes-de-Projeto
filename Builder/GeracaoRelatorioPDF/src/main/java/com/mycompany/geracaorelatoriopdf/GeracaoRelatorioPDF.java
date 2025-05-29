package com.mycompany.geracaorelatoriopdf;

public class GeracaoRelatorioPDF {

    public static void main(String[] args) {
        
        ReportBuilder builder = new LogisticsReportBuilder();
        ReportDirector director = new ReportDirector(builder);
        
        System.out.println("### Relatório Resumido ###");
        Report minimal = director.buildMinimalReport();
        minimal.show();
        
        System.out.println("\n### Relatório Completo ###");
        builder = new LogisticsReportBuilder();
        director = new ReportDirector(builder);
        Report full = director.buildFullReport();
        full.show();
    }
}
