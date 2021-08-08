package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.testes;

import br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes.Vetor;

public class VetorTeste {
    public static void main(String[] args) {
        Vetor vet = new Vetor(8);

        try {
//            vet.adiciona("A");
            vet.adiciona("B");
            vet.adiciona("C");
            vet.adiciona("D");
            vet.adiciona("E");
            vet.adiciona("F");
            vet.adiciona("G");
            vet.adiciona("X");
            vet.adiciona("X");
            vet.adiciona("X");
            vet.adiciona("X");
        } catch (Exception e) {
            e.printStackTrace();
        }




//        System.out.println(vet.tamanho());
//        System.out.println("Na posição indica está o Texto: " + vet.busca(8));

//        int x = vet.busca("marlannn");
//        if(x<0){
//            System.out.println("Não existe");
//        }
//        else {
//            System.out.println("posição " + x);
//        }

        System.out.println(vet);
        vet.adiciona(0,"A");
        System.out.println(vet);
        System.out.println(vet.tamanho());
        vet.remove(4);
        System.out.println(vet);
        System.out.println(vet.tamanho());



    }

}
