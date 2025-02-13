package org.example.HerenciaPersona;

public class Concierto {
    public static void main(String[] args) {

        Persona a1 = new Asistente("Carlos", 25, "VIP");
        Persona art1 = new Artista("Dua Lipa", 28, "Pop");
        Persona organizador1 = new Organizador("Diego", 18, "Seguridad");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        System.out.println("Información del Organizador:");
        organizador1.mostrarInfo();

        mostrarAcceso(art1);
        mostrarAcceso(a1);
        mostrarAcceso(organizador1);
    }

    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }
}
