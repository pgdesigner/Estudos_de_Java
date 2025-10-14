package com.fabrica.calculadora;

/**
 * Interface Strategy: Define o contrato para as operações matemáticas.
 */
public interface OperacaoMatematica {
    /**
     * Executa a operação matemática entre dois números.
     * @param numero1 O primeiro número.
     * @param numero2 O segundo número.
     * @return O resultado da operação.
     */
    double executar(double numero1, double numero2);
}