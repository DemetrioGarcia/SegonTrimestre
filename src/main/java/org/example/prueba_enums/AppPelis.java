package org.example.prueba_enums;

import java.util.Scanner;

public class AppPelis {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        SagaPelis peli = SagaPelis.SHREK;
        System.out.println(peli);

        for (SagaPelis pelis : SagaPelis.values()){
            System.out.println("Peli: "+pelis+" con "+pelis.getNro_Pelis()+ " pelis en total");
        }

        System.out.println("Introduce una saga: ");
        String saga = entrada.next().toUpperCase();
        SagaPelis saga_enum = SagaPelis.valueOf(saga);
        System.out.println("La saga escogida es "+saga_enum+" con  "+saga_enum.getNro_Pelis()+" peliculas");

        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada está en la posición "+posicion);

        String saga_string = SagaPelis.CREPUSCULO.name();
        System.out.println(saga_string);
    }
}
