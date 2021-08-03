package br.com.trainingloiane.javabasico.exercicios.java.basico.aula36.classe;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 6;
//        int fatorial=1;
////        int x = sc.nextInt();
//
//        for(int i = x; i > 1; i--){
//            fatorial *= i;
//        }
//
//        System.out.println(fatorial);


        System.out.println(fatorial(6));
        sc.close();
    }
    public static int fatorial (int num){       //Método Recursivo
        if(num==0){
            return 1;
        }
        return num * fatorial(num-1);
    }

}
