package org.example.HerenciaPersona;

public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador organizador1 = new Organizador("Diego", 18, "Seguridad");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        System.out.println("Información del Organizador:");
        organizador1.mostrarInfo();

    }
}
