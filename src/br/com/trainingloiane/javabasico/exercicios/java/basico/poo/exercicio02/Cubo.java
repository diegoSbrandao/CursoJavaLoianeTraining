package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio02;

public class Cubo extends Figura3D{
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return 6 * (lado*lado);
    };

    @Override
    public double calcularVolume() {
        return Math.pow(lado,3);
    }
}
