package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArraysList {

    public static void main (String[] args){

        ArrayList<Integer> listanum = new ArrayList<>();
        listanum.add(3);
        listanum.add(14);
        listanum.add(23);
        listanum.add(1,9);
        System.out.println(listanum);
        listanum.remove(0);
        listanum.remove(Integer.valueOf(45));
        System.out.println(listanum);
        System.out.println("La posición de 14: "+listanum.indexOf(14));
        System.out.println("La posición de 45: "+listanum.indexOf(45));

        for (int i = 0; i < listanum.size(); i++) {
            System.out.println(listanum.get(i));
        }

        for (int lista : listanum){
            System.out.println(lista);
        }

        listanum.set(0, 56);
        System.out.println(listanum.get(0));

        ArrayList<Integer> lista_copia = (ArrayList<Integer>) listanum.clone();

        listanum.clear();
        System.out.println(lista_copia);

        lista_copia.remove(1);

        if (listanum.contains(56)){
            System.out.println("La lista contiene el 56");
        } else{
            System.out.println("La lista no contiene el 56");
        }

        if (listanum.isEmpty()){
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("La lista no esta vacia");
        }

        System.out.println(lista_copia);

        insertarVarios(listanum, 1 ,2 ,3 ,4);
    }

    public static void insertarVarios(ArrayList<Integer> lista, Integer... n){

        lista.addAll(Arrays.asList(n));
    }
}
