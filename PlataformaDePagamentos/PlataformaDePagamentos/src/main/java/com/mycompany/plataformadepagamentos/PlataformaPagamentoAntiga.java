package com.mycompany.plataformadepagamentos;

public class PlataformaPagamentoAntiga implements PagamentoAntigo{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processador pela Plataforma"
                + " de Pagamento Antiga");
    }
    
}
