package com.mycompany.composite;

public class TrechoAereoComEscala implements TrechoAereo {
    
    private TrechoAereo t1;
    private TrechoAereo t2;

    public TrechoAereoComEscala(TrechoAereo t1, TrechoAereo t2) {
        if(t1.getDestino().equals(t2.getDestino())){
            throw new RuntimeException("A viagem de T2 nao eh igual ao destino de T1");
        }
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public String getOrigem() {
        return t1.getOrigem();
    }

    @Override
    public String getDestino() {
        return t2.getDestino();
    }

    @Override
    public int getCusto() {
        return t1.getCusto() + t2.getCusto();
    }

    @Override
    public int getDistancia() {
        return t1.getDistancia() + t2.getDistancia();
    }

}
