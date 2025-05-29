package com.mycompany.geracaorelatoriopdf;

public class Report {
    
    private String customerinfo;
    private String deliveries;
    private String statics;
    private String conclusion;

    public void setCustomerinfo(String customerinfo) {
        this.customerinfo = customerinfo;
    }

    public void setDeliveries(String deliveries) {
        this.deliveries = deliveries;
    }

    public void setStatics(String statics) {
        this.statics = statics;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
    
    public void show(){
        System.out.println("=====Relatório=====");
        if(customerinfo!=null){
            System.out.println("Cliente: \n"+customerinfo);
        }
        if (deliveries!=null) {
            System.out.println("Entregas:\n"+deliveries);
        }
        if(statics!=null){
            System.out.println("Estatísticas:\n"+statics);
        }
        if(conclusion!=null){
            System.out.println("Conclusão:\n"+conclusion);
        }
    }
    
}
