package org.example.CuentaBancaria;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException(String message) {

      System.out.println("ERROR. Depósito Máximo 3000€");    }
}
