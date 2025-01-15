package org.example;

import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosRecursividad {

    static Scanner entrada = new Scanner(System.in);

    public static void ejercicio0() {
        menu();
        seleccion();
        salir();
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
                int n = introducirDatos();
                int cifras = EjerciciosRecursividad.ejercicio1(n, 0);
                System.out.println(cifras);
                break;
            case 2:
                n = introducirDatos();
                int n1 = introducirDatos();
                int potencia = EjerciciosRecursividad.ejercicio2(n,n1);
                System.out.println(potencia);
                break;
            case 3:
                String opcion = intOstring();
                if (opcion.equals("n")) {
                    n = introducirDatos();
                    EjerciciosRecursividad.ejercicio3(n);
                }
//                }else if(opcion.equals("l")){
//                    EjerciciosRecursividad.ejercicio3(n);
//                }
                break;
            case 4:
                n = introducirDatos();
                EjerciciosRecursividad.ejercicio4(n);
                break;
            case 5:
                n = introducirDatos();
                EjerciciosRecursividad.ejercicio5(n);
                break;
            case 6:
                int n = introducirCadena();
                EjerciciosRecursividad.ejercicio6(n);
                break;
//            case 7:
//                int n = entrada.nextInt();
//                EjerciciosRecursividad.ejercicio7(n, 0);
//                break;
            default:
                System.exit(0);
                break;
        }
    }

    public static void salir() {
        String opcion;
        System.out.println("Elige una opción: ");
        System.out.println("    [M] - Volver al menú");
        System.out.println("    [X] - Salir");
        opcion = entrada.next();
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

        }else if (n < 10) {
            cantidad++;
        } else {
            cantidad++;
            cantidad = ejercicio1(n / 10, cantidad);
        }
        return cantidad;
    }

    static int potencia = 1;
    public static int ejercicio2(int num1, int num2) {

        if (num2 != 0) {
            potencia = potencia * num1;
            ejercicio2(num1, num2 - 1);
        } else if (num2==1){
            potencia = potencia * num1;
            return potencia;
        }
        else {
            return 1;
        }
        return potencia;
    }

    public static String intOstring(){
        System.out.println("Quieres introducir letras (L) o numeros (N) ?");
        String opcion = entrada.next();
        opcion = opcion.toLowerCase();
        opcion = String.valueOf(opcion.charAt(0));
        return opcion;
    }

    public static void ejercicio3(int n){
        if (n<10){
            System.out.print(n);
            System.out.println();

        }else {
            System.out.print(n%10);
            ejercicio3(n/10);
        }
    }

    public static void ejercicio4(int n){
        if(n==1 || n==0){
            System.out.println("El número es binario.");
        }
        else if (n%10==0 || n%10==1){
            ejercicio4(n/10);
        }
        else {
            System.out.println("El número no es binario.");
        }
    }

    public static int introducirDatos() {
        int numero;
        try {
            System.out.println("Introduce un número: ");
            numero = entrada.nextInt();
        } catch (InputMismatchException e){
            System.out.println("ERROR. Número no válido. ");
            entrada.nextLine();
            numero = -1;
        }
        if (numero < 0) {
            numero = introducirDatos();
        }
        return numero;
    }

    public static String ejercicio5(int n){

        if (n == 0 || n == 1){
            return Integer.toString(n);
        } else{
            return ejercicio5(n/2) + n%2;
        }
    }

    public static String introducirCadena(){
        System.out.println("Introduce una palabra: ");

        return entrada.next();
    }

    static char[] palabra;
    static int contador = 0;
    public static boolean ejercicio6(int contador){
        if (contador != palabra.length()-1){
            else{

            }
        }
        return true;
    }

}

