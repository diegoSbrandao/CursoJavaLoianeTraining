package br.com.trainingloiane.javabasico.exercicios.java.basico.interfacexercicios;

public class Cachorro extends Mamifero{
    private int tamanho;
    private String raca;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return null;
    }

    @Override
    public String amamentar() {
        return null;
    }
}
