package com.mycompany.singletonecommerce;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaDeLog {
    
    //Instância única da classe
    private static SistemaDeLog instancia;
    private FileWriter arquivoLog;
    private boolean LogsAtivados = true;
    
    //Atributo padrão para data/hora
    private final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    //Construtor privado para prevenir instanciação externa
    private SistemaDeLog(){
        try{
            //criar ou abrir o arquivo de log
            File arquivo = new File("aplicacao.log");
            arquivoLog = new FileWriter(arquivo, true);
        }catch(IOException e){
            System.err.println("Erro ao inicializar o sistema de log: " + e.getMessage());
        }
    }
    
    //Método publico para obter a instancia única
    public static SistemaDeLog getInstancia(){
        if(instancia == null){
            instancia = new SistemaDeLog();
        }
        return instancia;
    }
    
    //Método para registrar uma mensagem de log
    
    //[%s]: marcador [data/hora]
    // %s: nível do log (Debug, INFO ...)
    // %s: mensagem
    // %n: quebra de linha
    public void registrarLog(String mensagem, String nivel){
        if(!LogsAtivados)
            return;
        String logFormatado = String.format(
        "[%s] %s: %s%n", 
        LocalDateTime.now().format(formatador),
        nivel.toUpperCase(),
        mensagem
        );
        try{
            arquivoLog.write(logFormatado);
            //Garante que a mensagem vai ser escrita imediatamente  
            arquivoLog.flush();
        }catch(IOException ex){
            System.err.println("Erro ao escrever no log: " + ex.getMessage());
        }
    }
    
    //Método para controle do sistema de log
    public void ativarLogs(){
        this.LogsAtivados = true;
    }
    
    public void desativarLogs(){
        this.LogsAtivados = false;
    }
    
    //Fechar o arquivo de Log
    public void finalizar(){
        try{
            if(arquivoLog != null){
                arquivoLog.close();
            }
        }catch(IOException e){
            System.err.println("Erro ao fechar arquivo de log: " + e.getMessage());
        }
    }
            
}
