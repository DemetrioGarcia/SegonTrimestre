package org.example.HerenciaRedesSociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nombreUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario, int seguidores){
        this.nombre =nombre;
        this.edad=edad;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Información del Usuario:");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Nombre de Usuario: "+this.nombreUsuario);
        System.out.println("Seguidores: "+this.seguidores);
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSeguidores() {
        return seguidores;
    }

}
