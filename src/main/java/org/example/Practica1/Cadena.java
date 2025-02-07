package org.example.Practica1;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;

    public Cadena(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = listaPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
