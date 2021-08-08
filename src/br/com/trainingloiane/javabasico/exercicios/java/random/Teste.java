package br.com.trainingloiane.javabasico.exercicios.java.random;

import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(100);
        int[] vetor = new int[10];

        int maior = 0, menor = 100, maior10 = 0, maior50 = 0, total = 0, x = 0;

        for(int i = 0; i< vetor.length;i++){
            vetor[i]= sc.nextInt();
        }


        System.out.println();
        for (int lista : vetor) {
            menor = Math.min(lista, menor);
            maior = Math.max(lista, maior);
            x = vetor.length;
            total += lista;
        }
        System.out.println("------------Menor número do vetor: ------------------");
        System.out.println(menor);
        System.out.println("------------Maior número do vetor: -------------------");
        System.out.println(maior);
        System.out.println("------------Média dos números do vetor:-------------------");
        System.out.println(total / x);


        System.out.println("------------Números do vetor > que 10 : --------------");

        for (int lista : vetor) {
            if (lista >= 10 && lista < 50) {
                System.out.println(lista);
            }
        }
        System.out.println("------------Números do vetor >= que 50------------------");

        for (int lista : vetor) {
            if (lista >= 50) {
                System.out.println(lista);
                ;
            }
        }

    }

}

