package br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.classe.Aluno;
import br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.classe.Pessoa;
import br.com.trainingloiane.javabasico.exercicios.java.basico.aula37.classe.Professor;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        double[] nota = new double[]{10,9,8};
        aluno.setNotas(nota);

        System.out.println(aluno);


    }

}
