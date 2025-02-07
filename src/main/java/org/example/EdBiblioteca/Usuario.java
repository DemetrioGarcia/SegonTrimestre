package org.example.EdBiblioteca;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Esta clase contiene la información sobre los usuarios y su lista de libros prestado
 * @author: Demetrio García
 * @version 1.1
 * @see Libro
 */
@Getter @Setter
public class Usuario {

    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor de Usuarios, tambien crea una lista de libros para cada usuario
     * @param nombre nombre del usuario
     * @param idUsuario id del usuario
     */
    public Usuario (String nombre, int idUsuario){
        this.nombre=nombre;
        this.idUsuario=idUsuario;
        librosPrestados = new ArrayList<>();
    }

    /**
     * Método para prestar libros, si el libro existe, además llama a prestarLibro (de la clase Libro) para cambiar su disponibilidad
     * @param libro libro que queremos prestar.
     */
    public void prestarLibro(Libro libro){
        libro.prestarLibro(libro);
        librosPrestados.add(libro);
    }

    /**
     * Método para devolver los libros, y llamar a la clase Libro, para volver a cambiar su disponibilidad.
     * @param libro libro para devolver
     */
    public void devolverLibro(Libro libro){
        libro.devolverLibro(libro);
        librosPrestados.remove(libro);
    }

    /**
     * Método para listar los libros que tienen prestados un usario.
     */
    public void listarLibrosPrestados(){
        System.out.println("Libros Prestados: ");
        if (!librosPrestados.isEmpty()){
            for (Libro libro : librosPrestados){
                System.out.println(" - "+ libro.mostrarInformacion());
            }
        } else {
            System.out.println("No hay libros prestados");
        }
    }

}
