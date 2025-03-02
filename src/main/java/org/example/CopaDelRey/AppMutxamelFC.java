package org.example.CopaDelRey;


import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {

        ArrayList<MutxamelFC> integrantes = new ArrayList<>();

        // crear varios jugadores para el equipo SENIOR
        Jugador jugador1 = new Jugador("David", 21, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Carlos", 22, Equipos.SENIOR, 2, Posiciones.DEFENSA);
        Jugador jugador3 = new Jugador("Daniel", 24, Equipos.SENIOR, 10, Posiciones.CENTROCAMPISTA);
        integrantes.add(jugador3);
        integrantes.add(jugador2);
        integrantes.add(jugador1);

        // crear al entrenador del equipo SENIOR
        Entrenador entrenador1 = new Entrenador("Paco", 42, Equipos.SENIOR, "4-3-3");
        integrantes.add(entrenador1);

        // crear a los masajistas del club
        Masajista masajista1 = new Masajista("Chuby", 29, "Masajista experto", 1);
        integrantes.add(masajista1);

        // crear a algún acompañante para un par de jugadores
        Acompanyante acompanyante1 = new Acompanyante("Marina", 32, jugador3, "Hermana");
        Acompanyante acompanyante2 = new Acompanyante("Damian", 50, jugador1, "Padre");
        integrantes.add(acompanyante1);
        integrantes.add(acompanyante2);

        // concentrarse()
        for (MutxamelFC integrante : integrantes){
            integrante.concentrarse();
        }
        System.out.println();

        // entrenar()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).entrenar();
            }
        }
        System.out.println();

        // darMasaje() a algún jugador
        masajista1.darMasaje(jugador2);
        System.out.println();

        // viajar() a Madrid
        for (MutxamelFC integrante : integrantes){
            integrante.viajar("Madrid");
        }
        System.out.println();

        // planificarEntrenamiento()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Entrenador){
                ((Entrenador) integrante).planificarEntrenamiento();
            }
        }
        System.out.println();

        // entrenar()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).entrenar();
            }
        }
        System.out.println();

        // descansar()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Jugador){
                ((Jugador) integrante).descansar();
            }
        }
        System.out.println();

        // calentar()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Jugador){
                ((Jugador) integrante).calentar();
            }
        }
        System.out.println();

        // jugarPartido()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof AccionesDeportivas){
                ((AccionesDeportivas) integrante).jugarPartido("Real de Madrid");
            }
        }
        System.out.println();

        // animarEquipo()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Acompanyante){
                ((Acompanyante) integrante).animarEquipo();
            }
        }
        System.out.println();

        // hacerCambios()
        entrenador1.hacerCambios(jugador1, jugador2);

        // marcarGol()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Jugador){
                ((Jugador) integrante).marcarGol();
            }
        }
        System.out.println();

        // celebrarGol()
        for (MutxamelFC integrante : integrantes){
            integrante.celebrarGol();
        }
        System.out.println();

        // darMasaje() a varios jugadores
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Jugador){
                masajista1.darMasaje((Jugador) integrante);
            }
        }
        System.out.println();

        // viajar() a Mutxamel
        for (MutxamelFC integrante : integrantes){
            integrante.viajar("Mutxamel");
        }
        System.out.println();

        // descansar()
        for (MutxamelFC integrante : integrantes){
            if (integrante instanceof Jugador){
                ((Jugador) integrante).descansar();
            }
        }
        System.out.println();
    }
}
