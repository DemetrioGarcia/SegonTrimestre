package org.example.casa;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

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
        electrodomesticos = new ArrayList<>();
    }

    public void agregarElectrodomestico(String nombre, double consumo) {

        for (Electrodomestico valor : electrodomesticos) {
            if (valor.getNombre().equals(nombre)) {
                System.out.println("Error. El electrodomestico ya existe.");
                return;
            }
        }
        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);
        electrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos() {
        System.out.println("La habitacion "+nombre+" tiene: ");
        for (Electrodomestico valor : electrodomesticos) {
            System.out.println(" - " + valor.getNombre() + " ( " + valor.getConsumo() + "Kwh)");
        }
    }

    public double calcularConsumo() {
        double consumototal = 0;

        for (Electrodomestico valor : electrodomesticos) {

            consumototal =+ valor.getConsumo();
        }
        return consumototal;
    }

    @Override
    public String toString(){
        return "- " + nombre + ":  " + metrosCuadrados + " m^2";
    }
}
