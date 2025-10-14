package com.fabrica.calculadora;

/**
 * Estratégia Concreta: Implementa a operação de Subtração.
 */
public class Subtracao implements OperacaoMatematica {
    @Override
    public double executar(double numero1, double numero2) {
        return numero1 - numero2;
    }
}