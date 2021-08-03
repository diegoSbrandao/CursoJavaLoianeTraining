package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe;

/*
3. Escreva  uma  class  para  representar  um  Aluno.
Adicione  atributos   relacionados  às  caracteristicas  de  um  Aluno,
como  nome,  matricula,  curso   que  está  matriculado,
nome  de  3  disciplinas  que  está  cursando  e  as  notas   dessas  3  disciplinas.

Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  (nota  maior  ou  igual  a  7)
 em  uma  determinada  disciplina.
Escreva  um  programa  para  testar  essa  classe, que  pede  as  informações  do   aluno  ao  usuário
 e  ao  final  informa  o  nome  das  disciplinas,  mostra  as   notas  e  mostra  se  o  aluno
 foi  aprovado  ou  não.
 */

import java.util.Arrays;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String disciplina;
    private double[] nota;

    public Aluno() {
    }

    public Aluno(String nome, int matricula, String curso, String disciplina, double[] nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public void aprovarAluno(double[] notas, String disciplina){
        this.disciplina = disciplina;
        this.nota = notas;
        double soma =0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        soma = soma/notas.length;

        if(soma >= 7){
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }

    @Override
    public String toString() {
        return "Nome do Aluno: " +nome+"\nMatrícula: "+matricula+"\nCurso: "+curso+
                "\nDisciplina: " + disciplina +
                "\nNotas: " + Arrays.toString(nota);
    }
}
