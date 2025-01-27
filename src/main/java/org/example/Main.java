package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("LoTr", "JRT");
        Libro libro2 = new Libro("HP", "JKR");

        System.out.println(libro1);
        System.out.println(libro2);
        libro1.estaDisponible();

        libro1.prestar(new Estudiante("Daniel"));
        libro2.devolver();
        libro1.devolver();
    }
}