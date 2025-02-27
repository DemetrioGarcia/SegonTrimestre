package org.example.CopaDelRey;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println(getNombre()+" esta planificando el entrenamiento.");
    }

    public void hacerCambios(Jugador jugador1, Jugador jugador2){
        System.out.println(getNombre()+" cambia a "+jugador1.getNombre()+" "+jugador1.getDorsal()+" por "+jugador2.getNombre()+" "+jugador2.getDorsal());
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
        System.out.println(getNombre()+" esta dirigiendo el entrenamiento...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" jugará contra "+ rival);
    }
}
