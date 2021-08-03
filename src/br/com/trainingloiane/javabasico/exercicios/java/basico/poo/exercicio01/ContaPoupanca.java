package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
