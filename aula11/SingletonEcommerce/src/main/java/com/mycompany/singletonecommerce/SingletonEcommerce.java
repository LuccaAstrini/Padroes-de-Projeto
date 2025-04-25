package com.mycompany.singletonecommerce;

public class SingletonEcommerce {

    public static void main(String[] args) {
        
        // Obter a instancia única do sistema de log
        SistemaDeLog logger = SistemaDeLog.getInstancia();
        
        // Simulação do módulo carrinho de compras
        logger.registrarLog("Item adicionado ao carrinho: Produto XYZ", "INFO");
        
        //Simulação do módulo de pagamento
        logger.registrarLog("Pagamento Processado com sucesso", "INFO");
        
        // Simulação do módulo de catálogo
        try{
            throw new RuntimeException("Erro ao carregar imagem do produto");
        }catch (RuntimeException e){
            logger.registrarLog(e.getMessage(), "ERRO");
        } 
        
        // Desativar os logs
        logger.desativarLogs();
        logger.registrarLog("Essa mensagem não será regisrada", "DESBUG");
        
        // Reativar os logs
        logger.ativarLogs();
        logger.registrarLog("Sistema Inicializado com sucesso", "INFO");
        
        logger.finalizar();
    }
}
