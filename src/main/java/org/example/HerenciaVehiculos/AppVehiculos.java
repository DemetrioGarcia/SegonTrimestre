package org.example.HerenciaVehiculos;

public class AppVehiculos {

    public static void main(String[] args) {

        Avion airbus = new Avion("Airbus", "1234PK", 2);
        Tren ave = new Tren("Renfe", "11S", 8);

        airbus.ImprimirVehiculo();
        ave.ImprimirVehiculo();

        airbus.ruido();
        ave.ruido();
    }
}
