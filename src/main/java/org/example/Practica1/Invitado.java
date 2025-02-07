package org.example.Practica1;

import lombok.ToString;

import java.time.LocalDate;
import java.util.Scanner;

@ToString
public class Invitado {

    Scanner entrada = new Scanner(System.in);

    private static LocalDate fecha = LocalDate.of(2025,3,15);
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        //this.fecha_visita = setFecha_visita();
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha){
        System.out.println("Introduce la fecha: ");
        //this.fecha_visita = entrada.nextLine();

    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
