package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula56;

import java.util.Scanner;

/*
Exercício de fixação sobre enum, criar uma calculadora
 */

public enum Operacao {
    SOMA('+') {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    SUBTRACAO('-') {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MUTIPLICACAO('*') {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVISAO('/') {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private char simbolo;

    Operacao(char simbolo){
        this.simbolo = simbolo;
    }
    public abstract double executarOperacao(double x, double y);

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operacao[] calculadora = Operacao.values();
        double a = 5;
        double b = 10;

        for(Operacao cal: calculadora){
            System.out.println("Operação: "+ cal +" " +cal.getSimbolo());
            System.out.print(a+" " + cal.simbolo+" "+b+" = ");
            System.out.println(cal +" " + cal.executarOperacao(a, b));
//            System.out.println(cal +" " + cal.executarOperacao(sc.nextDouble(), sc.nextDouble()));
        }

        sc.close();
    }
}

