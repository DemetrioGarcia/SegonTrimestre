package org.example;

public class Recursividad {

    public static void main(String[] args) {
        int cont = 1;
        int total = 0;
        int Suma = Suma( cont, total);
        System.out.println(Suma);
    }

    public static int Suma(int a,int b) {

        if (a > 10) {
            return b;
        } else {
            b = Suma(a+1, b+=a);
        }
        return b;
    }
}
