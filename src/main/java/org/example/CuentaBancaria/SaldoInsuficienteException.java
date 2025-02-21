package org.example.CuentaBancaria;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {
      System.out.println("ERROR. Saldo Insuficiente");
    }
}
