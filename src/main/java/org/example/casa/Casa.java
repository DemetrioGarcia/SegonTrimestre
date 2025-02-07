package org.example.casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner entrada = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private Propietario propietario;

    public Casa(String direccion) {

        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {

        for (Habitacion valor : habitaciones) {
            if (valor.getNombre().equals(nombre)) {
                System.out.println("Error. La habitacion ya existe.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene: " + habitaciones.size() + " habitaciones: ");
        for (Habitacion valor : habitaciones) {
            System.out.println(" - " + valor.getNombre() + " ( " + valor.getMetrosCuadrados() + "m^2 )");
        }
    }

    public void eliminarHabitacion(String nombre) {

        for (Habitacion valor : habitaciones) {
            if (valor.getNombre().equals(nombre)) {
                habitaciones.remove(valor);
                System.out.println(valor.getNombre() + " eliminad@");
                return;
            }
        }
        System.out.println("La habitación no existe.");

    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion habmayor = habitaciones.get(0);

        for (Habitacion valor : habitaciones) {

            if (valor.getMetrosCuadrados() > habmayor.getMetrosCuadrados()) {
                habmayor = valor;
            }
        }

        return habmayor;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario:");
        String nombre = entrada.next();
        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getHabitacionMasConsume() {

        Habitacion habitacion = habitaciones.getFirst();
        double consumomax = 0;

        for (Habitacion valor : habitaciones) {

            if (valor.calcularConsumo()>consumomax){
                consumomax = valor.calcularConsumo();
                habitacion = valor;
            }
        }
        return habitacion.getNombre()+ "con un consumo de: "+habitacion.calcularConsumo()+" Kwh";
    }


    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

}
