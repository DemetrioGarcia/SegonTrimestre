package org.example.casa;

public class Habitacion {

    private String nombre;
    private double metrosCuadrados;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public Habitacion(String nombre, double metrosCuadrados){

        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }


    @Override
    public String toString(){
        return "- " + nombre + " [ " + metrosCuadrados + " m^2";
    }
}
