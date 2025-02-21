package org.example.HerenciaPersona;

public enum TipoEntrada {

    GENERAL(50),
    VIP(200),
    PISTA(100);

    private int precio;

    TipoEntrada (int precio){
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }

}
