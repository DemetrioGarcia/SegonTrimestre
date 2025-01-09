package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosRecursividad {

    static Scanner entrada = new Scanner(System.in);

    public static void ejercicio0() {
        menu();
        seleccion();
    }

    public static void menu() {
        System.out.println("*** Batería de ejercicios sobre recursividad***");
        System.out.println("Seleccione a continuación el modo a ejecutar: ");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden Alfabético");
        System.out.println("7 - Mostrar suma");
    }

    public static void seleccion() {
        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                int n = entrada.nextInt();
                EjerciciosRecursividad.ejercicio1(n, 0);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.exit(0);
                break;
        }
    }

    public static void salir() {
        System.out.println("Elige una opción: ");
        System.out.println("    [M] - Volver al menú");
        System.out.println("    [X] - Salir");
        String opcion = entrada.nextLine();
        opcion = opcion.toLowerCase();
        opcion = String.valueOf(opcion.charAt(0));

        if (opcion.equals("m")) {
            ejercicio0();
        } else {
            System.exit(0);
        }
    }

    public static int ejercicio1(int n, int cantidad) {

        if (n == 0 && cantidad == 0) {

        } else if (n < 10 && cantidad == 0) {
            cantidad++;
        } else if (n < 10) {
            cantidad++;
        } else {
            cantidad++;
            cantidad = ejercicio1(n / 10, cantidad);
        }
        return cantidad;
    }

     static int potencia;
    public static int Ejercicio2(int num1, int num2) {

        potencia = num1 * num1;
        if (num2 != 0) {
            potencia = Ejercicio2(num1, num2 - 1);
        } else if (num2==0) {
            return potencia;
        }
        return potencia;
    }

    public static int introducirDatos() {
        int numero;
        try {
            numero = entrada.nextInt();
        } catch (InputMismatchException e){
            entrada.nextLine();
            numero = -1;
        }
        if (numero < 0) {
            numero = introducirDatos();
        }
        return numero;
    }

}

