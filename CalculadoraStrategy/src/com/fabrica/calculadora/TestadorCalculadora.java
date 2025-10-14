package com.fabrica.calculadora; // <-- Pacote correto

/**
 * Classe de Controle/Teste: Instancia as classes e testa o padrão Strategy.
 */
public class TestadorCalculadora {

    public static void main(String[] args) {
        double numA = 20.0;
        double numB = 5.0;
        double resultado;

        System.out.println("--- Teste do Padrão Strategy para Operações Matemáticas ---");
        System.out.println("Números base: " + numA + " e " + numB);
        System.out.println("----------------------------------------------------------");

        // 1. Estratégia de SOMA
        ContextoCalculadora contextoSoma = new ContextoCalculadora(new Soma());
        resultado = contextoSoma.calcular(numA, numB);
        System.out.println("Soma: " + numA + " + " + numB + " = " + resultado + " (Esperado: 25.0)");

        // 2. Estratégia de SUBTRAÇÃO
        ContextoCalculadora contextoSubtracao = new ContextoCalculadora(new Subtracao());
        resultado = contextoSubtracao.calcular(numA, numB);
        System.out.println("Subtração: " + numA + " - " + numB + " = " + resultado + " (Esperado: 15.0)");

        // 3. Estratégia de MULTIPLICAÇÃO
        contextoSoma.setOperacao(new Multiplicacao());
        resultado = contextoSoma.calcular(numA, numB);
        System.out.println("Multiplicação: " + numA + " * " + numB + " = " + resultado + " (Esperado: 100.0)");

        // 4. Estratégia de DIVISÃO
        ContextoCalculadora contextoDivisao = new ContextoCalculadora(new Divisao());
        resultado = contextoDivisao.calcular(numA, numB);
        System.out.println("Divisão: " + numA + " / " + numB + " = " + resultado + " (Esperado: 4.0)");
        
        // Teste de Divisão por Zero
        resultado = contextoDivisao.calcular(numA, 0.0);
        System.out.println("Divisão por Zero: " + numA + " / 0.0 = " + resultado);

        System.out.println("----------------------------------------------------------");
        System.out.println("Execução finalizada.");
    }
}