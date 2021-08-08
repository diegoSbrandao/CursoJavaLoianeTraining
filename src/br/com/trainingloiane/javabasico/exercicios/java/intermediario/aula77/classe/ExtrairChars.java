package br.com.trainingloiane.javabasico.exercicios.java.intermediario.aula77.classe;

public class ExtrairChars {
    public static void main(String[] args) {
        //Métodos usados: charAt, getChars, getBytes, toCharArray
        String java = "Java";

        for(int i =0; i < java.length(); i++){
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[3];
        java.getChars(0,3,jav,0);
        System.err.println(jav);

        //System.out.println(jav);

    }
}
