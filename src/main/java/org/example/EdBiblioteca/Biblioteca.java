package org.example.EdBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    public Biblioteca(){
        catalogo = new ArrayList<>();
        usuariosRegistrados = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }

    public void registrarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);
    }

    public void buscarLibro(String titulo){
        if (catalogo.contains(titulo)){
            System.out.println("El libro: "+ titulo + " existe");
        }
        else {
            System.out.println("El libro "+ titulo +" existe.");
        }
    }

    public void mostrarCatalogo(){
        System.out.println("Catalogo: ");
        for (Libro libro : catalogo){
            System.out.println(" - "+libro.mostrarInformacion());
        }
    }
}
