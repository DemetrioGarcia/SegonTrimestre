package org.example;

import java.util.Scanner;

public class EjerciciosRecursividad {

    static Scanner entrada;

    public static int Ejercicio0(){
        System.out.println("*** Batería de ejercicios sobre recursividad***");
        System.out.println("Seleccione a continuación el modo a ejecutar: ");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden Alfabético");
        System.out.println("7 - Mostrar suma");
        int seleccion = entrada.nextInt();
        switch (seleccion) {
            case 1:
                int n = entrada.nextInt();
                EjerciciosRecursividad.Ejercicio1(n);
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
        return seleccion;
    }

    public static int Ejercicio1(int n){

        int cantidad = 1;

        if (n==0){
            return cantidad;
        }
        else {
            while (n >= 10){
                n = n/10;
                cantidad++;
            }
        }
        return cantidad;
    }

    public static int Ejercicio2(int )
}
