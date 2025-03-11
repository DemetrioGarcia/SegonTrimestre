package org.example.Programame;

import java.util.Arrays;

public class RepartiendoOrchata {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        String datos = entrada.nextLine();
        String[] orchata = datos.split(" ");
        int cantidad = Integer.parseInt(orchata[0]);
        int gente = Integer.parseInt(orchata[1]);

        if (cantidad==0 && gente==0) {
            return false;
        }else {

            int[][] personas = new int[gente][2];
            for (int i = 0; i < gente; i++) {
                String[] gentes = null;
                String persona1 = entrada.nextLine();
                gentes = persona1.split(" ");
                personas[i][0] = Integer.parseInt(gentes[0]);
                personas[i][1] = Integer.parseInt(gentes[1]);
            }

            System.out.println(Arrays.deepToString(personas));
            return true;
        }
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {

        }
    }

}

