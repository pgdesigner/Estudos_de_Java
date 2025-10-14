package com.fabrica.calculadora;

/**
 * Estratégia Concreta: Implementa a operação de Divisão.
 */
public class Divisao implements OperacaoMatematica {
    @Override
    public double executar(double numero1, double numero2) {
        if (numero2 == 0) {
            System.err.println("Erro: Divisão por zero não permitida!");
            return Double.NaN; // Retorna Not a Number
        }
        return numero1 / numero2;
    }
}