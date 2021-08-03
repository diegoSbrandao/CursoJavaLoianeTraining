package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio01;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public boolean sacar(double valor) {

        double saldoComLimite = this.getSaldo() + limite;
        if ((saldoComLimite - valor) >=0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

}