package org.example.Enum_semaforo;

public enum Semaforo {

    AMARILLO,
    ROJO,
    VERDE;

    public Semaforo siguiente(Semaforo semaforo) {

        return switch (semaforo) {
            case ROJO -> Semaforo.VERDE;
            case VERDE -> Semaforo.AMARILLO;
            case AMARILLO -> Semaforo.ROJO;
            default -> Semaforo.ROJO;
        };
    }
}
