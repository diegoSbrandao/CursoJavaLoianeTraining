package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula75.classe;

public class Construtores {
    public static void main(String[] args) {
        char[] abcdefghi = {'A','B','C','D','E','F','G','H','I'};
        String ABC = new String(abcdefghi, 0,3); // ao utilizar assim, comando offset,
                                                            // podemos determinar o que quero do texto
        System.out.println(ABC);

        byte[] ascii = {68,73,69,71,79};
        String name = new String(ascii);
        System.out.println(name);
    }
}
