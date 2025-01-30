package org.example.casa;

public class CasaAPP {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 12);
        casa.agregarHabitacion("Cocina", 10);
        casa.agregarHabitacion("Baño", 8);

        casa.mostrarHabitaciones();

    }
}
