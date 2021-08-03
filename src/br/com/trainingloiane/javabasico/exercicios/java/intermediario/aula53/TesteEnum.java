package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula53;

public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana d = DiaDaSemana.DOMINGO;

        DiaDaSemana[] dia = DiaDaSemana.values();

        for(DiaDaSemana x: dia){
            System.out.println("Dia da Semana: " + x.getValor() +" "+ x);
        }
        //System.out.println(d.getValor());
    }
}
