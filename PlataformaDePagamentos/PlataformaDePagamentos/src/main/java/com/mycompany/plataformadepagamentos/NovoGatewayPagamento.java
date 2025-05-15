package com.mycompany.plataformadepagamentos;

public class NovoGatewayPagamento implements PagamentoNovoGateway{

    @Override
    public void processarPagamento(String valor) {
        System.out.println("Pagamento de R$ " + valor +
                "processado pelo Novo Gateway de Pagamento");
    }
    
}
