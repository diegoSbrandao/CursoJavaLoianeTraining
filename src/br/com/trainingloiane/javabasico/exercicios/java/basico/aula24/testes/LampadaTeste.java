package br.com.trainingloiane.javabasico.exercicios.java.basico.aula24.testes;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula24.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("A60","BIVOLT","BRANCA","NEON",60,20,50.00);
                
        System.out.println(lampada);
    }
}
