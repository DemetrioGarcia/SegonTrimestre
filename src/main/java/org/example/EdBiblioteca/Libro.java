package org.example.EdBiblioteca;
import lombok.Getter;
import lombok.Setter;

/**
 * Esta clase contiene la información sobre libro.
 * @author: Demetrio García
 * @version 1.1
 */
@Getter @Setter
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    /**
     * Constructor de la clase libro, siempre cuando creamos un libro estará disponible
     * @param titulo , nombre del libro.
     * @param autor , autor del libro.
     * @param anioPublicacion , año en el que fue publicado el libro
     */
    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.disponible=true;
    }

    /**
     * Método para prestar un libro y cambiar su valor de disponible.
     * @param libro libro a prestar
     */
    public void prestarLibro(Libro libro) {
        if (libro.disponible) {
            System.out.println("El libro " + libro.titulo + " ha sido prestado ");
            libro.disponible = false;
        } else {
            System.out.println("El libro " + libro.titulo + " no esta disponible.");
        }
    }

    /**
     * Método para devolver un libro si ha sido prestado antes. Cambia el valor de disponible.
     * @param libro Libro a devolver
     */
    public void devolverLibro(Libro libro) {
        if (libro.disponible) {
            System.out.println("El libro no ha sido prestado.");
        } else {
            System.out.println("El libro: " + libro.titulo + " ha sido devuelto");
            libro.disponible = true;
        }
    }

    /**
     * Método para sacar por pantalla la información de libro.
     * @return nos devuelve toda la inforamción de libro en un String.
     */
    public String mostrarInformacion(){
        return "Titulo: "+this.titulo+" Autor: "+this.autor+" Año de publicacion: "+this.anioPublicacion+" Disponible:" +this.disponible;
    }
}
