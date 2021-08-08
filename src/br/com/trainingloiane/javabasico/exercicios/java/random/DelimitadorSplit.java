package br.com.trainingloiane.javabasico.exercicios.java.random;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/*
Sample Input:
He is a very very good boy, isn't he?

Sample Output:
10
He
is
a
very
very
good
boy
isn
t
he
 */

public class DelimitadorSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // scan.useDelimiter("\\Z");
     //   String s = scan.next().trim();

        String S = scan.nextLine();
        try {

            int i = Integer.parseInt(S);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println("Bad String.");
        }
//
//        if (s.length() > 0) {
//            String[] tokens = s.split("[!,?._'@\\s]+");
//            System.out.println(tokens.length);
//            for (String token : tokens) {
//                System.out.println(token);
//            }
//        } else {
//            System.out.println(0);
//        }
        scan.close();
    }
}



