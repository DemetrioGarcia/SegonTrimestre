package org.example.HerenciaPersona;

public class Organizador extends Persona{

    private String rol;

    public Organizador(String nombre, int edad, String rol) throws EdadMinimaException {
        super(nombre, edad);
        this.rol=rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + this.rol);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Organizador: Coordinando el evento");
    }
}
