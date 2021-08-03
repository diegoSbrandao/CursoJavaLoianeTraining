package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe.Aluno;

import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[3];
        Aluno a = new Aluno("Arthur do val",326,"Ciências","Ciencias 2",notas);

        System.out.println("Digite suas notas: ");
        for(int i=0; i <notas.length; i++){
            notas[i] = sc.nextDouble();
        }
        a.aprovarAluno(notas,"Matemática");
        System.out.println(a);

    }
}
