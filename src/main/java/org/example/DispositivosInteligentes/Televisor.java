package org.example.DispositivosInteligentes;

public class Televisor extends Dispositivo {

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!isEstado()) {
            System.out.println("Encendiendo Televisor...");
            setEstado(true);
        } else {
            System.out.println("El televisor ya está encendido");
        }
    }
}