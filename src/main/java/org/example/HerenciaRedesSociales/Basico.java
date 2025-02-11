package org.example.HerenciaRedesSociales;

public class Basico extends Usuario{


    public Basico(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Información de la Persona Normal:");
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Nombre de Usuario: "+getNombreUsuario());
        System.out.println("Seguidores: "+getSeguidores());
    }
}
