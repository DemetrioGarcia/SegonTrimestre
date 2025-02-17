package org.example.Ecommerce;

import java.util.Scanner;

public class Tienda {

    static Scanner entrada = new Scanner(System.in);

    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.ProcesarPago(importe);
        finPrograma();
    }

    public static void finPrograma(){
        System.out.println("Pago realizado con exito. muchas gracias!!");
        System.exit(0);
    }

    public static void iniciarPago(){
        System.out.println("Que método de pago quieres utilizar? [Tarjeta, Bizum, Paypal]");
        eleccionPago( entrada.next());
    }

    public static void eleccionPago(String eleccion){
        switch (eleccion.toLowerCase()){
            case "tarjeta" :
                System.out.println("Introduce el número de la tarjeta: ");
                String num = entrada.next();
                System.out.println("Introduce el tipo de tarjeta: ");
                String tipo = entrada.next();
                TarjetaCredito tarjeta = new TarjetaCredito(num,tipo);
                tarjeta.validarTarjeta(tarjeta);
                MetodoPago tarjetavalida = new TarjetaCredito(tarjeta.getNro_Tarjeta(),tarjeta.getTipo());
                double importe = introducirImporte();
                realizarPago(tarjetavalida,importe );
                break;
            case "paypal" :
                System.out.println("Introduce el correo electrónico: ");
                String correo = entrada.next();
                Paypal paypal = new Paypal(correo);
                importe = introducirImporte();
                paypal.validarPayPal(paypal, importe);
                MetodoPago paypalvalido = new Paypal(paypal.getCorreo());
                realizarPago(paypalvalido,importe );
                break;
            case "bizum":
                System.out.println("Introduce el número de teléfono: ");
                String tlf = entrada.next();
                Bizum bizum = new Bizum(tlf);
                bizum.validarBizum(bizum);
                MetodoPago bizumvalido = new Bizum(bizum.getTelefono());
                importe = introducirImporte();
                realizarPago(bizumvalido,importe );
                break;
            default:
                System.out.println("Método de pago NO reconocido.");
                Tienda.iniciarPago();
                break;
        }
    }

    public static double introducirImporte(){
        System.out.println("Introduce el importe a pagar: ");
        return entrada.nextDouble();
    }
}
