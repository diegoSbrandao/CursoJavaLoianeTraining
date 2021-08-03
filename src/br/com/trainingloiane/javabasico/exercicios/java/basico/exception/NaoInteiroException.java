package br.com.trainingloiane.javabasico.exercicios.java.basico.exception;

public class NaoInteiroException extends Exception{
    int numeros;
    int denominadores;

    public NaoInteiroException(int numeros, int denominadores) {
        super();
        this.numeros = numeros;
        this.denominadores = denominadores;
    }

    @Override
    public String toString() {
        return "Resultado de " + numeros + "/" + denominadores + " não é inteiro!";
    }
}
