package org.example.BancMutxamel;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cuenta {

    private String iban;
    private Cliente titular;
    private double saldo;

}
