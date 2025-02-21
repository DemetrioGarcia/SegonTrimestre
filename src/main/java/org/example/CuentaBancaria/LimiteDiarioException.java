package org.example.CuentaBancaria;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException(String message) {
      System.out.println("ERROR. Limite diario alcanzado");
    }
}
