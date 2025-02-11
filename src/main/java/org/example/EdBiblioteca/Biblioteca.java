package org.example.EdBiblioteca;
import java.util.ArrayList;

/**
 * Esta clase contiene la información sobre la Biblioteca que contiene un catalogo de libros y una lista de usuarios.
 * @author: Demetrio García
 * @version 1.1
 * @see Libro
 * @see Usuario
 */
public class Biblioteca {

    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    /**
     * Constructor de la clase biblioteca que nos crea dos listas vacias (catalogo y usuariosRegistrados)
     */
    public Biblioteca(){
        catalogo = new ArrayList<>();
        usuariosRegistrados = new ArrayList<>();
    }

    /**
     * Método para añadir un libro a la lista del catalogo
     * @param libro Libro que se va a añadir a la lista.
     */
    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }

    /**
     * Método para registrar un Usuario a la lista de usuarios registrados.
     * @param usuario Usuario que se va añadir a la lista
     */
    public void registrarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);
    }

    /**
     * Método que nos busca si el título de un libro se encuentra en nuestro catalogo
     * @param titulo nombre del titulo de la obra que queremos buscar.
     */
    public void buscarLibro(String titulo){
        if (catalogo.contains(titulo)){
            System.out.println("El libro: "+ titulo + " existe");
        }
        else {
            System.out.println("El libro "+ titulo +" existe.");
        }
    }

    /**
     * Método que nos muestra el Catalogo de libros y su información.
     */
    public void mostrarCatalogo(){
        System.out.println("Catalogo: ");
        for (Libro libro : catalogo){
            System.out.println(" - "+libro.mostrarInformacion());
        }
    }
}
