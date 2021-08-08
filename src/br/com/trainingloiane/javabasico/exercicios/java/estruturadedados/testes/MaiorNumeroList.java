package br.com.trainingloiane.javabasico.exercicios.java.estruturadedados.testes;

import java.util.ArrayList;
import java.util.Collections;

public class MaiorNumeroList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("1"));
        arrayList.add(new Integer("8"));
        arrayList.add(new Integer("3"));
        arrayList.add(new Integer("5"));

       // Object obj = Collections.max(arrayList);
        Collections.sort(arrayList); // Sort the arraylist
        arrayList.get(arrayList.size() - 1); //gets the last item, largest for an ascending sort
        System.out.println(arrayList);
    }
}