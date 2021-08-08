package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.testes;

import br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes.Contatos;
import br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes.Lista;

public class ListaTeste {
    public static void main(String[] args) {
        Lista<Contatos> vetor = new Lista<>(1);

        Contatos c1 = new Contatos("Diego", "(55) 0000000000", "zzzzz.zzzzzzz@outlook.com");
        Contatos c2 = new Contatos("XXXXX", "(55) 55555-5555", "xxxxx.xxxxxxx@outlook.com");
        Contatos c3 = new Contatos("YYYYY", "(55) 44444-4444", "yyyyy.yyyyyyy@outlook.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);
    }
}
