package org.example.biblioteca;

public class AppBiblio {

    public static void main(String[] args) {

        Editorial editorial1 = new Editorial("Editorial1", "España");
        Editorial editorial2 = new Editorial("Editorial2", "England");
        Libro libro1 = new Libro("LoTr", "JRT", editorial1);
        Libro libro2 = new Libro("HP", "JKR", editorial2);
        Libro libro3 = new Libro("El hobbit", "JRT", editorial1);
        Libro libro4 = new Libro("Mortadelo", "JRT", editorial1);
        Estudiante estudiante1 = new Estudiante("Daniel");
        Estudiante estudiante2 = new Estudiante("Manolito");
        System.out.println(libro1);
        System.out.println(libro2);
        libro1.estaDisponible();

        libro1.prestar(estudiante1);
        libro2.devolver(estudiante2);
        libro1.devolver(estudiante1);
        libro2.prestar(estudiante2);
        System.out.println(editorial1);
        System.out.println(editorial2);
    }
}
