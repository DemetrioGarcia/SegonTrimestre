package org.example.Ecommerce;

import java.util.regex.Pattern;

public class Paypal extends MetodoPago{

    private String correo;
    private double saldo;
    private final double SALDODEF = 23;
    private final Pattern formatoCorreo = Pattern.compile("[a-zA-Z0-9]+.*@[A-Za-z].*\\.com");

    public Paypal(String correo){
        this.correo=correo;
        this.saldo=SALDODEF;
    }

    @Override
    void ProcesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con PayPal");
    }

    public void validarPayPal(Paypal paypal, double importe ) {
        if (!correo.matches(formatoCorreo.pattern()) || saldo<importe){
            System.out.println("ERROR. formato de correo incorrecto o saldo insuficiente.");
            Tienda.iniciarPago();
        } else {
            System.out.println("Validando PayPal...");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCorreo() {
        return correo;
    }

}
