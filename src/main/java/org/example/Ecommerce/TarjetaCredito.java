package org.example.Ecommerce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class TarjetaCredito extends MetodoPago{

    private String nro_Tarjeta;
    private String tipo;
    private final Pattern formato = Pattern.compile("[0-9]{16}");
    private final String[] TIPOS = {"VISA","MASTERCARD", "MAESTRO"};

    public TarjetaCredito(String nro_Tarjeta,String tipo){
        this.nro_Tarjeta=nro_Tarjeta;
        this.tipo=tipo;
    }

    @Override
    void ProcesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con tarjeta de crédito "+tipo.toUpperCase());
    }

    public void validarTarjeta(TarjetaCredito tarjeta){
        if (nro_Tarjeta.length() != 16 || !nro_Tarjeta.matches(formato.pattern()) || !Arrays.asList(TIPOS).contains(tipo.toUpperCase()) ){
            System.out.println("ERROR en los datos de la tarjeta");
            Tienda.iniciarPago();
        }
        else {
            System.out.println("Validando tarjeta...");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public String getNro_Tarjeta() {
        return nro_Tarjeta;
    }

}
