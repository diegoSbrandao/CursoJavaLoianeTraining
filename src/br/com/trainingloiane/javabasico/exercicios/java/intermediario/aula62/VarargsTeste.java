package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula62;

import java.util.Scanner;

public class VarargsTeste {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] vet = new int[3];

        for(int i=0; i< vet.length; i++){
            vet[i]=sc.nextInt();
        }

        System.out.println(soma(vet));

    }


    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(int[] vetor) {
        int total = 0;

        for (int i : vetor) {
            total += i;
        }
        return total;
    }
}
