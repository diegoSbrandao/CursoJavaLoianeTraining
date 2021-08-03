package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula57;

import java.util.Scanner;

public class TesteWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String x = "555";
//        int a = Integer.parseInt(x);
//        System.out.println(x+15);
//        System.out.println(a+15);
//        Integer A = 5;
//        Integer B = 51;
//        String xa = "aaa";
//        String yx = "dddaaa";
//
//            if(xa.equalsIgnoreCase(yx)){
//                System.out.println("igual");
//            }
//            else {
//                System.out.println("diferente");
//            }
        String s = sc.nextLine().trim();
        System.out.println(s.length());

        String nome = "He is a very very good boy, isn't he?";
        String delims = "[A-Za-z !,?._'@]+";

       // String subString = nome.replaceAll("\\p{Punct}", "");

//        System.out.println(n);
//        for (String nomes : nome.split(delims, n)) {
//            System.out.println(nomes);
//        }

        sc.close();
    }
}
