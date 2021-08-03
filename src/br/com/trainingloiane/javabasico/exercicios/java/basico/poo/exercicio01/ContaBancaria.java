package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio01;

/*
Para todos os exercícios, não esquecer de encapsular os atributos com métodos getters e setter, criar os construtores apropriados e também o método toString.

Exercício 01 - Conta Bancária

Elabore uma classe ContaBancaria com os seguintes atributos:

nomeCliente
numConta
saldo

E os seguintes métodos:

sacar(o saldo não pode ficar negativo)
depositar

Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as seguintes características:

ContaPoupanca

atributo diaRendimento
método calcularNovoSaldo, recebe taxa de rendimento da poupança e atualiza o saldo.

ContaEspecial

atributo limite
sobrescreva o método sacar com a nova lógica necessária

Crie uma classe Teste que contenha a seguinte lógica:

Criar contas
Sacar um valor das contas
Depositar
Mostrar um novo saldo a partir de um rendimentot
Mostrar os dados da conta do cliente

 */

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {

        if((this.saldo-valor) >=0)
        {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }


    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

}
