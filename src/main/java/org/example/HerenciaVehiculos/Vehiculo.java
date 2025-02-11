package org.example.HerenciaVehiculos;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
    }

    public void ImprimirVehiculo(){
        System.out.println("Marca: "+this.marca+", Matricula: "+this.matricula);
    }

    public void ruido(){
        System.out.println("Brrrr Brrr");
    }
}
