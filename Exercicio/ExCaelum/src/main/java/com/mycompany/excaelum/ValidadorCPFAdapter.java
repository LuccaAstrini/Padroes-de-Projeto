package com.mycompany.excaelum;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidadorCPFAdapter implements ProtocoloDeValidacaoDeCPF{
    
    private CPFValidator validador = new CPFValidator();

    @Override
    public boolean isCPFValido(String cpf) {
       try{
           validador.assertValid(cpf);
           return true;
       }catch(InvalidStateException e){
           return false;
       }
    }
    
}
