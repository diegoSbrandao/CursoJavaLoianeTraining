package br.com.trainingloiane.javabasico.exercicios;

import java.util.Scanner;

/*
Decompor um número, somando todos os números dele.
 */

public class Decomposicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 102351;
        int soma = 0;

        do {
            soma += (n%10);
            n/=10;
        }while (n!=0);

        System.out.println(soma);

        sc.close();
    }
}
