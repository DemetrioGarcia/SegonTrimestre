package org.example.biblioteca;

import java.time.LocalDate;

public class Prestamo {

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fecha;

    public Prestamo(Estudiante estudiante, Libro libro){
        this.estudiante=estudiante;
        this.libro=libro;
        fecha = LocalDate.now();
    }

    @Override
    public String toString(){
        return "Prestamo a : "+ estudiante.getNombre()+" el libro: "+ libro.getTitulo()+" el día: "+fecha;
    }

}
