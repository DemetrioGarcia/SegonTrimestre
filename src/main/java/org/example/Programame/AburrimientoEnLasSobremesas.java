package org.example.Programame;

public class AburrimientoEnLasSobremesas {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        int cerillas = entrada.nextInt();
        if (cerillas==0) {
            return false;
        }else {

         int cant=0;
         for (int i=0 ;i <= cerillas; i++){
            cant= cant + (i*3);
         }
            System.out.println(cant);
            return true;
        }
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {

        }
    }

}


