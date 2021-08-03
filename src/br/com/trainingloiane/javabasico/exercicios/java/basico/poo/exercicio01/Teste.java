package br.com.trainingloiane.javabasico.exercicios.java.basico.poo.exercicio01;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("Diego","555-444-23",9500);
        ContaPoupanca cp = new ContaPoupanca("Irineu","111-333-46",50);
        ContaEspecial contaEspecial = new ContaEspecial("Manolo","222-777-31",6300);

        //System.out.println(cp.getSaldo());
        cp.setDiaRendimento(29);

        if(cp.calcularNovoSaldo(0.5)){
            System.out.println("Dia do rendimento, seu saldo atualizado: "+cp.getSaldo());
        }
        else {
            System.out.println("Não é o dia de rendimento, seu saldo é: "+ cp.getSaldo());
        }



    }
}
