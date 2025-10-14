package com.fabrica.calculadora;

/**
 * Estratégia Concreta: Implementa a operação de Soma.
 */
public class Soma implements OperacaoMatematica {
    @Override
    public double executar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}