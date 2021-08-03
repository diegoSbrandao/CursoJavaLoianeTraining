package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula63;

public class PrintfTeste {
    public static void main(String[] args) {
        System.out.printf("%S", "olá mundo\n"); //Torna caixa alta todo o texto
        System.out.printf("olá mundo","%S");
        System.out.printf("\n%s", "OLÁ MUNDO\n");
        System.out.printf("Testando %n");
        System.out.printf("Testando2");
        System.out.printf("%nTestando3");
        System.out.printf("%n");
        int valor = 5468;
        System.out.printf("%d",valor);
    }
}
