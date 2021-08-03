package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.teste;

import br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe.ContaCorrente;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123,5000,false,12000);
        cc.saldo();
        cc.sacarConta(500);
        cc.saldo();
        cc.chequeEspecial(true);
        cc.saldo();
        System.out.println("---------");
        cc.depositarConta(78);
        cc.saldo();

        System.out.println("____________________________");
        cc.chequeEspecial(false);
        cc.sacarConta(4500);
        System.out.println(cc);
    }
}
