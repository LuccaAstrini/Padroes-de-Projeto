package com.mycompany.excaelum;

public class StellaCPFAdapter implements ProtocoloDeValidadorCPF {

    @Override
    public boolean valida(String cpf) {
        StellaCPFAdapter cpfValidator = new StellaCPFAdapter();
        cpfValidator.assertValid(cpf);
    }

}
