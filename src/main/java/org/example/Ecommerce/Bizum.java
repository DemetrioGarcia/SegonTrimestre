package org.example.Ecommerce;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Math.random;

public class Bizum extends MetodoPago{

    Random random = new Random();
    static Scanner entrada = new Scanner(System.in);
    private String telefono;
    private int pin;
    private final Pattern formatotlf = Pattern.compile("[0-9]{9}");

    public Bizum (String telefono){
        this.telefono=telefono;
        this.pin= random.nextInt(899999)+100000;
    }


    @Override
    void ProcesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con Bizum");
    }

    public void validarBizum(Bizum bizum){

        if (telefono.matches(formatotlf.pattern()) ) {
            System.out.println("Pin generado: "+pin);
            System.out.println("Introduce el pin de seguridad: ");
            int pinintroducido = entrada.nextInt();
            if (pin!=pinintroducido) {
                System.out.println("Pin introducidos INCORRECTO.");
                Tienda.iniciarPago();
            } else {
                System.out.println("Validando bizum...");
            }
        } else {
            System.out.println("Número de telefono incorrecto.");
            Tienda.iniciarPago();
        }
    }

    public String getTelefono() {
        return telefono;
    }

}
