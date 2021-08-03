package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio02;

public class Circulo extends Figura2D implements DimensaoSuperficial{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio*raio*Math.PI;
    }
}
