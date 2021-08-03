package br.com.trainingloiane.javabasico.exercicios.java.basico.aula52.classe;

public class AgendaCheiaExeption extends Exception{
    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
