package br.com.trainingloiane.javabasico.exercicios;

import java.util.Random;

public class First {
    public static void main(String[] args) {
        Random random = new Random();
        int[] notas = new int[10];

        for (int nota : notas) {
            nota = random.nextInt(100);
            System.out.println(nota);
        }
    }
}
