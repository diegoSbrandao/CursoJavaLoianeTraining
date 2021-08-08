package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.testes;

import br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.classes.Contatos;

import java.util.ArrayList;

public class ArrayListTeste {
    public static void main(String[] args) {
        Contatos c = new Contatos();


        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(00);
        aList.add(11);
        aList.add(22);
        aList.add(33);
        aList.add(44);
        System.out.println(aList);
        aList.clear();
        System.out.println(aList);
        aList.add(07);
        System.out.println(aList);



//
//        Contatos c1 = new Contatos("Diego","(55) 0000000000","zzzzz.zzzzzzz@outlook.com");
//        Contatos c2 = new Contatos("XXXXX","(55) 55555-5555","xxxxx.xxxxxxx@outlook.com");
//        Contatos c3 = new Contatos("YYYYY","(55) 44444-4444","yyyyy.yyyyyyy@outlook.com");
//
//        ArrayList<Object> arrayList = new ArrayList<>();
//        arrayList.add(c1);
//        arrayList.add(c2);
//        arrayList.add(c3);
//
//
//        System.out.println(arrayList.lastIndexOf("Diego"));





//        System.out.println(arrayList.indexOf("D"));
//
//        System.out.println(arrayList);
//        arrayList.add(1,"B");
//        System.out.println(arrayList);

//        boolean existe = arrayList.contains("AB");
//        if(existe) {
//            System.out.println("Existe");
//        }
//        else {
//            System.out.println("Não existe!");
////        }
//
//        System.out.println(arrayList.indexOf("D"));
//      //  arrayList.remove(9);
//        arrayList.remove("Z");
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
//        arrayList.add("aa");
//        System.out.println(arrayList.size());

    }
}
