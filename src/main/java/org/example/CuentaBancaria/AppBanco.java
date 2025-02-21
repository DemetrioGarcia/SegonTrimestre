package org.example.CuentaBancaria;

import java.util.Scanner;

public class AppBanco {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
       boolean aux = true;
        CuentaBancaria cuenta = new CuentaBancaria(10);

        while (aux) {
           menu();
           eleccion(cuenta);
       }
    }

    public static void menu(){
        System.out.println("=== CAJERO AUTOMÁTICO ===");
        System.out.println();
        System.out.println("    [1]. Consultar saldo");
        System.out.println("    [2]. Ingresar dinero");
        System.out.println("    [3]. Retirar dinero");
        System.out.println("    [X]. Salir");
        System.out.println();
        System.out.print("Seleccione una opción: ");

    }

    public static void eleccion(CuentaBancaria cuentaBancaria){
        String eleccion = entrada.next();

        switch (eleccion){
            case "1":
                cuentaBancaria.consultarSaldo();
                break;
            case "2":
                cuentaBancaria.ingresar();
                break;
            case "3":
                cuentaBancaria.retirar();
                break;
            default:
                System.out.println("Saliendo del sistema...");
                System.exit(0);
        }
    }
}
