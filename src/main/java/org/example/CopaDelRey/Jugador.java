package org.example.CopaDelRey;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posicion=posicion;
    }

    public void calentar(){
        System.out.println(getNombre()+ " sale a calentar.");
    }

    public void descansar(){
        System.out.println(getNombre()+" esta descansando..");
    }

    public void marcarGol(){
        System.out.println(getNombre()+" ha mercado GOL!! ");
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

    @Override
    public void entrenar() {
        System.out.println(getNombre()+" esta entrenando...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" jugará contra "+ rival);
    }


    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

}
