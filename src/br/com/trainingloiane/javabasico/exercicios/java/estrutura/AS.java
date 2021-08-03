package br.com.trainingloiane.javabasico.exercicios.java.estrutura;

import java.util.Scanner;

public class AS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String frase;

          frase = ( N <=5 ||N > 20) ? "Not Weird" : "Weird";
        System.out.println(frase);
        sc.close();
    }
}
