package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        System.out.println(lampada);
        System.out.println("-----------------");
        lampada.mudarEstado();
        System.out.println(lampada);
        lampada.mudarEstado();
        System.out.println(lampada);

    }
}
