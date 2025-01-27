package org.example;

public class Estudiante {

    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private Libro libroPrestado;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
    }

    public Estudiante(String nombre, String curso, String email) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
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

    public Libro getLibroPrestado() {
        return libroPrestado;
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

    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    @Override
    public String toString() {
        return "Alumno: [nombre=  " + this.nombre + " curso: " + this.curso + " nia: " + this.nia + " email: " + this.email + "]";
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
