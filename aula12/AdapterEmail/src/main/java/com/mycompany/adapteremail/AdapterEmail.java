package com.mycompany.adapteremail;

public class AdapterEmail {

    public static void main(String[] args) {

        String email = "lucca.astrini@gmail.com";
        
        ProtocolDeValidacaoDeEmail protocolo = new Validador_Email_Adapter();

        if (protocolo.isValidEmailAdress(email)) {
            System.out.println(email + " eh valido");
        } else {
            System.out.println(email + ": nao eh valido");
        }
    }
}
