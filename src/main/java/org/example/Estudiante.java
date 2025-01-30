package org.example;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNia() {
        return this.nia;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void anyadirLibro(Libro libro){
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro){
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
//        if (!librosPrestados.isEmpty()) {
            return "Alumno: [nombre=  " + this.nombre + " curso: " + this.curso + " nia: " + this.nia + " email: " + this.email + "Libros: "+ librosPrestados + "]";
//        }
//        else {
//            return "Alumno: [nombre=  " + this.nombre + " curso: " + this.curso + " nia: " + this.nia + " email: " + this.email + "]";
//        }
    }

    public static int obtenerTotalEstudiantes() {

        return contadorEstudiantes;
    }

    public static void validarCorreo(String email) {
        if (email.matches("[A-Za-z0-9+_./]+@alu.edu.gva.es$")){

        }
        else{
            System.out.println("El correo NO es válido.");
        }
    }
}
