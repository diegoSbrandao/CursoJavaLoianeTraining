package br.com.trainingloiane.javabasico.exercicios;

/*
Exercício Tabuda
 */
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7;

        for(int i = 1; i <= 10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }


        sc.close();
    }
}
