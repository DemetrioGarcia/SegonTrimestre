package org.example.biblioteca;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro(String titulo, String autor, Editorial editorial) {
        cantidadLibros++;
        librosDisponibles++;
        this.titulo = titulo;
        this.autor = autor;
        this.id = generarId();
        this.disponible = true;
        estudiantePrestado = null;
        this.editorial= editorial;
        editorial.anyadirLibro(this);
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    private String generarId() {

        if (cantidadLibros < 10) {
            return "LIB00" + cantidadLibros;
        } else if (cantidadLibros < 100) {
            return "LIB0" + cantidadLibros;
        } else {
            return "LIB" + cantidadLibros;
        }
    }

    public Prestamo prestar(Estudiante estudiante) {

        if (disponible && !estudiante.getLibrosPrestados().contains(this)) {
            disponible = false;
            System.out.println("El libro ha sido prestado con éxito a "+estudiante.getNombre());
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            System.out.println("Libros disponibles después del préstamo: "+librosDisponibles);
            Prestamo prestamo = new Prestamo( estudiante, this);
            System.out.println(prestamo);
            return prestamo;
        } else if (estudiante.getLibrosPrestados().contains(this) ) {
            System.out.println("El estudiante "+ estudiante.getNombre()+ " ya tiene el libro prestado.");
        } else {
            System.out.println("El libro "+getTitulo()+ " ya ha sido prestado.");
        }
        return null;
    }

    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro ha sido devuelto con éxito por "+estudiantePrestado.getNombre());
            librosDisponibles++;
            System.out.println("Libros disponibles después de la devolución: "+librosDisponibles);
            estudiantePrestado = null;
            estudiante.devolverLibro(this);
        } else {
            System.out.println("El libro NO estaba prestado");
        }
    }

    public void estaDisponible() {
        System.out.println(this.disponible);
    }

    public static void getCantidadLibros() {
        System.out.println("Total de libros creados: " + cantidadLibros);
        ;
    }

    public static void getLibrosDisponibles() {
        System.out.println("Libros Disponibles: "+librosDisponibles);
    }

    @Override
    public String toString(){
        return titulo + " , " + autor + " , "+ id + " , " + disponible;
    }



}
