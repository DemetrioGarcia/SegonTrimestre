package org.example.CopaDelRey;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
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

    public void darMasaje(Jugador jugador){
        System.out.println(getNombre()+" le esta dando un masaje a "+jugador.getNombre());
    };
}
