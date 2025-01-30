package org.example;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Persona> componentes;

    public Equipo(String nombre){
        this.nombre = nombre;
        componentes = new ArrayList<>();
    }

    public ArrayList<Persona> getComponentes() {
        return componentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setComponentes(ArrayList<Persona> componentes) {
        this.componentes = componentes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anyadirComponentes(Persona persona){
        componentes.add(persona);
    }

    public void eliminarComponente(Persona persona){
        componentes.remove(persona);
    }

    @Override
    public String toString(){
        return "nombre: "+nombre+" componentes: "+componentes ;
    }

    public static void main(String[] args) {
            Persona persona1 = new Persona("Pepe","García", "52345324Q", 120, 23);

            Equipo equipo1 = new Equipo("FC Mutxamel");
            System.out.println(equipo1);

            equipo1.anyadirComponentes(persona1);
            System.out.println(equipo1);
    }
}
