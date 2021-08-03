package br.com.trainingloiane.javabasico.exercicios.java.basico.aula25.classe;

/*
2. Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,
um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite.
- Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),
- Despositar  dinheiro,
- Consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque  especial  ou  não.
- Desenvolva  um  programa   para  testar  essa  classe.
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(){

    }
    public ContaCorrente(int numero, double saldo, boolean especial, double limite){
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public void sacarConta(double saque){
        if(saldo > 0) {
            this.saldo -= saque;
        }
        else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositarConta(double depositar){
       this.saldo += depositar;
    }

    public void chequeEspecial(boolean cheque){
        this.especial = cheque;
    }

    public void saldo(){
        System.out.println("Seu saldo: "+saldo);
        if(especial){
            System.out.println("Você está usando cheque especial");
        }
        else {
            System.out.println("Você NÃO está usando cheque especial.");
        }
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", especial=" + especial +
                ", limite=" + limite +
                '}';
    }
}
