package br.com.trainingloiane.javabasico.exercicios.java.basico.aula35.classe;

/*
1. Escreva  uma  classe  chamada  Contador,
que  tem  um  atributo  estático  que   é  incrementado  sempre  que  a  classe  for  instanciada.
Crie  métodos  para   zerar,  incrementar  e  retornar  o  valor  do  contador.
Desenvolva  um   programa  para  testar  essa  classe.

 */
public class Contador {
    private static int contador;

    public Contador(){
        contador++;
        System.out.println("Contador = "+contador);
    }

    public static void zerarContador(){
        contador = 0;
    }

    public static void incrementarContador(){
        contador ++;
    }

    public static int valorContador(){
        return +contador;
    }


}
