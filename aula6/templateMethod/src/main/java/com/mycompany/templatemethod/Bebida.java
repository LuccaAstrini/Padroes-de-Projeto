package com.mycompany.templatemethod;

public abstract class Bebida {
    
    public final void prepare(){
        feverAgua();
        infusao();
        despejarNaXicara(); 
        adicionarCondimentos();
    }

    public void feverAgua() {
        System.out.println("Ferver um pouco de água.");
    }
    
    public abstract void infusao();
    
    public void despejarNaXicara(){
        System.out.println("Desepejar a bebida na xícara.");
    }
    
   public abstract void adicionarCondimentos();
   
}
