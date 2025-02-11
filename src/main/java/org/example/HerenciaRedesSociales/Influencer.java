package org.example.HerenciaRedesSociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public void agregarColaboraciones(String ... colaboracion){
        colaboraciones.addAll(Arrays.asList(colaboracion));
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Información del Influencer:");
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Nombre de Usuario: "+getNombreUsuario());
        System.out.println("Seguidores: "+getSeguidores());
        System.out.println("Colaboraciones: "+colaboraciones);
    }
}
