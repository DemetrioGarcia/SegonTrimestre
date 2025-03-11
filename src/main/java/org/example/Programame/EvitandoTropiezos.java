package org.example.Programame;

import java.util.Scanner;

public class EvitandoTropiezos {

    static Scanner entrada = new Scanner(System.in);

    public static boolean casoDePrueba() {
        if (!entrada.hasNext()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {


        }
    }

}
