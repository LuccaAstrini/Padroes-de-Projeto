package com.mycompany.excaelum;

public class ExCaelum {

    public static void main(String[] args) {
        String cpf = "123.456.789-09";
        
        ProtocoloDeValidacaoDeCPF validador = new ValidadorCPFAdapter();
        
        if(validador.isCPFValido(cpf)) {
            System.out.println(cpf + " eh valido");
        }else{
            System.out.println(cpf + " eh invalido");
        }
    }
}
