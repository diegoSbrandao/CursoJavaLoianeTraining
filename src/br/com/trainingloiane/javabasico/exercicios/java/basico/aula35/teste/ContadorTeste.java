package br.com.trainingloiane.javabasico.exercicios.java.basico.aula35.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula35.classe.Contador;


public class ContadorTeste {

    static void imprimirValor() {
        System.out.println(" O valor atual do contador: " + Contador.valorContador());
    }

    public static void main(String[] args) {
        Contador.incrementarContador();
        Contador.incrementarContador();
        Contador.incrementarContador();
        imprimirValor();
        Contador.zerarContador();
        imprimirValor();
        Contador.incrementarContador();
        imprimirValor();

        System.out.println("Após instanciar");
        Contador c = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        imprimirValor();

    }
}
