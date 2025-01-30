package org.example.biblioteca;

import java.util.ArrayList;

public class Editorial {

    private String Nombre;
    private String Pais;
    private ArrayList<Libro> listaLibros;

    public Editorial (String Nombre, String Pais){
        this.Nombre = Nombre;
        this.Pais = Pais;
        listaLibros = new ArrayList<>();
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void anyadirLibro(Libro libro){
        listaLibros.add(libro);
    }

    public void retirarLibro(Libro libro){
        listaLibros.remove(libro);
    }
    @Override
    public String toString(){

        return "Editorial : nombre= " +getNombre()+ " pais= "+getPais() + " Lista de libros: "+listaLibros;
    }
}
