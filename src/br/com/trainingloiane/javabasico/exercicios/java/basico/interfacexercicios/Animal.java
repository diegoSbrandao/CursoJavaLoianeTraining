package br.com.trainingloiane.javabasico.exercicios.java.basico.interfacexercicios;

public abstract class Animal {
    private String nome;

    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
