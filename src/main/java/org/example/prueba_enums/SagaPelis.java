package org.example.prueba_enums;

public enum SagaPelis {

    SHREK(6),
    HARRY_POTTER(9),
    CREPUSCULO(4),
    SPIDERMAN(14),
    A_TODO_GAS(11);

    private int nro_Pelis;

    SagaPelis(int nro_Pelis){
        this.nro_Pelis = nro_Pelis;
    }

    public int getNro_Pelis(){
        return nro_Pelis;
    }
}
