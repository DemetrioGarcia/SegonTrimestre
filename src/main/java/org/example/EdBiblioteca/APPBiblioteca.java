package org.example.EdBiblioteca;

public class APPBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca() ;

        Libro libro1 = new Libro("Titulo1", "autor1", 1999);
        Libro libro2 = new Libro("Titulo2", "autor2", 2014);
        Libro libro3 = new Libro("Titulo3", "autor3", 1970);

        System.out.println(libro3.mostrarInformacion());

        Usuario user1 = new Usuario("user1", 1);
        Usuario user2 = new Usuario("user2", 2);

        user2.prestarLibro(libro3);
        user2.prestarLibro(libro2);
        user2.listarLibrosPrestados();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.registrarUsuario(user2);
        biblioteca.registrarUsuario(user1);

        biblioteca.mostrarCatalogo();
    }
}
