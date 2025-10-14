package com.fabrica.calculadora;

/**
 * Classe Contexto: Mantém uma referência à estratégia e a executa.
 */
public class ContextoCalculadora {
    private OperacaoMatematica operacao;

    /**
     * Construtor que define qual estratégia (operação) será usada.
     * @param operacao A estratégia de operação a ser utilizada.
     */
    public ContextoCalculadora(OperacaoMatematica operacao) {
        this.operacao = operacao;
    }

    /**
     * Executa a operação delegando a chamada para a estratégia configurada.
     * @param numero1 O primeiro número.
     * @param numero2 O segundo número.
     * @return O resultado da operação.
     */
    public double calcular(double numero1, double numero2) {
        return operacao.executar(numero1, numero2);
    }

    /**
     * Método opcional para alterar a estratégia em tempo de execução.
     * @param operacao A nova estratégia de operação.
     */
    public void setOperacao(OperacaoMatematica operacao) {
        this.operacao = operacao;
    }
}