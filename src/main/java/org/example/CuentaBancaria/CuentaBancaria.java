package org.example.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {

    Scanner entrada = new Scanner(System.in);

    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo=saldo;
    }

    public void ingresar(){
        System.out.println("Introduce importe a ingresar: ");
        double ingreso = entrada.nextDouble();
        this.saldo = saldo+ingreso;
        System.out.println("Dinero ingresado con éxito. Saldo actual: "+saldo+"€");
    }

    public void retirar(){
        System.out.println("Introduce importe a retirar: ");
        double retirar = entrada.nextDouble();
        this.saldo = saldo-retirar;
        System.out.println("Dinero retirado con éxito. Saldo actual: "+saldo+"€");
    }

    public void consultarSaldo(){
        System.out.println();
        System.out.println("Tu saldo es: "+getSaldo()+" €");
        System.out.println();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
