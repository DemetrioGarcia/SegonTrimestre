package org.example.CopaDelRey;

public class Acompanyante extends MutxamelFC {

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    public void animarEquipo(){
        System.out.println(getNombre()+" esta animando al equipo.");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrandose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOLL");
    }
}
