package com.mycompany.geracaorelatoriopdf;

public interface ReportBuilder {
    
    public void buildCustomerInfo();
    public void buildDeliveries();
    public void buildStatics();
    public void buildConclusion();
    public Report getReport();
    
}
