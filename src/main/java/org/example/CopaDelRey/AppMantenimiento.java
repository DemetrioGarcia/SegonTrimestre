package org.example.CopaDelRey;

import java.util.Scanner;

public class AppMantenimiento {

    static Scanner entrada = new Scanner(System.in);
    
    public void menu(){
        System.out.println("=== App de  Mantenimiento del MUTXAMEL FC ===");
        System.out.println();
        System.out.println("    [1]. Mantenimiento de jugadores");
        System.out.println("    [4]. Consultar equipos");
        System.out.println("    [X]. Salir");

    }
    
    public void seleccion(){
        char eleccion = entrada.next().charAt(0);
        switch (eleccion){
            case 1:
                mantenimientoJugadore();
                break;
            case 4:
                consultarEquipos();
                break;
            default:
                System.exit(0);
        }
    }

    private void consultarEquipos() {
    }

    private void mantenimientoJugadore() {
    }

}
