package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula62;

import java.util.Scanner;

public class VarargsTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(soma(4,58,9,3,4,6,159,258,3));//Método Varargs

    }

//    static int soma(int a, int b) {
//        return a + b;
//    }
//
//    static int soma(int[] vetor) {
//        int total = 0;
//
//        for (int i : vetor) {
//            total += i;
//        }
//        return total;
//    }

    static int soma(Integer... vet) {
        int total = 0;

        for (int i : vet) {
            total += i;
        }
        return total;
    }
}
