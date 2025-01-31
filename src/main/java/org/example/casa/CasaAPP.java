package org.example.casa;

public class CasaAPP {

    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 32);
        casa.agregarHabitacion("Cocina", 20);
        casa.agregarHabitacion("Baño", 8);

        casa.getHabitaciones().get(1).agregarElectrodomestico("Nevera", 110);
        casa.getHabitaciones().get(2).agregarElectrodomestico("Cepillo Electrico", 0.2);

        casa.mostrarHabitaciones();
        System.out.println("La habitación más grande es: "+casa.getHabitacionMasGrande());
        System.out.println("La habitación que más consume es: "+casa.getHabitacionMasConsume());

    }
}
