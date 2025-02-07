package org.example.Practica1;

import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String director){
        this(nombre, cadena, 0,director);
    }

    public Programa(String nombre, Cadena cadena, int temporadas, String director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.director = new Empleado(director, "director", null );
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        listaEmpleados.add(new Empleado(nombre, cargo, director));
    }

    public void insertarInvitado(String nombre, String profesion, int temporada) {
        listaInvitados.add(new Invitado(nombre, profesion, temporada));
    }

    public void imprimirDirector(){
        System.out.println(director);
    }
}
