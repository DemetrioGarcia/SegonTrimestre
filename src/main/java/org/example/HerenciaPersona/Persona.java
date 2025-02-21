package org.example.HerenciaPersona;

public class Persona {

    private static final int EDAD_MIN = 18;

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadMinimaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadMinimaException {
        if (edad < EDAD_MIN) {
            this.edad = edad;
            throw new EdadMinimaException("No puedes crear un asistente menor de edad.");
        } else {
            this.edad = edad;
        }
    }

}
