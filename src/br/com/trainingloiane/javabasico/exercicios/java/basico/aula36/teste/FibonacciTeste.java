package br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.classe.Fibonacci;

public class FibonacciTeste {
    public static void main(String[] args) {

        for(int i =0; i < 20; i++){
            System.out.print(" " + Fibonacci.fibonacci(i));
        }
    }
}
