package com.mycompany.composite;

public class TrechoAereoComConexao extends TrechoAereoComEscala{
    
    private int tarifaconexao;
    
    
    public TrechoAereoComConexao(TrechoAereo t1, TrechoAereo t2, int tarifaconexao) {
        super(t1, t2);
        this.tarifaconexao = tarifaconexao;
    }
    
    @Override
    public int getCusto(){
        return super.getCusto() + tarifaconexao;
    }
    
    
}
