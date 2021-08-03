package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula53;

public class EnumAula {
    public static void main(String[] args) {

        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        imprimirDiaSemana(dia);

    }

    private static void imprimirDiaSemana(DiaDaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-feira.");
                break;
            case TERCA:
                System.out.println("Terça-feira.");
                break;
            case QUARTA:
                System.out.println("Quarta-feira.");
                break;
            case QUINTA:
                System.out.println("Quinta-feira.");
                break;
            case SEXTA:
                System.out.println("Sexta-feira.");
                break;
            case SABADO:
                System.out.println("Sábado.");
                break;
            case DOMINGO:
                System.out.println("Domingo.");
                break;
            default:
                try {
                    throw new DiaDaSemanaException();
                } catch (DiaDaSemanaException e) {
                    System.out.println(e.getMsg());
                    e.printStackTrace();
                }
        }
    }
}
