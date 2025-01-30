package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaDeLaCompra {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        estaVacia(lista);
        lista.add("Agua");
        anyadirElementos(lista,"Leche","Azucar", "Pan");
    }

    public static void estaVacia(ArrayList lista){
        if (lista.isEmpty()){
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("La lista no esta vacia.");
        }
    }

    public static void anyadirElementos(ArrayList<String> lista, String... item){

        lista.addAll(Arrays.asList(item));
    }
}