package org.example.DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre){
        this.nombre=nombre;
        this.estado=false;
    }

    public abstract void encender();

    public void apagar(){
        if (estado){
            System.out.println("El dispositivo ha sido apagado.");
            estado=false;
        } else {
            System.out.println("El dispositivo ya esta apagado.");
        }
    }

    public void mostrarEstado(){
        System.out.println("Dispositivo: "+getNombre()+"Estado: "+isEstado());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
