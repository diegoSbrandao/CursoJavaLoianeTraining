package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes;

public class Programa {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.defineMarca("Sony");
        tv.ligar();
        tv.definirVolume(10);
        tv.aumentaVolume(10);
        tv.aumentaVolume(10);
        tv.definirCanal(7);
        tv.desligar();
    }
}
