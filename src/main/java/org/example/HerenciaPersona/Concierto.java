package org.example.HerenciaPersona;

public class Concierto {
    public static void main(String[] args) throws EdadMinimaException{

        Persona a1 = new Asistente("Carlos", 15, TipoEntrada.VIP);
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

        for (TipoEntrada entrada : TipoEntrada.values()){
            System.out.println("Entrada tipo "+entrada.name()+" con precio de "+entrada.getPrecio());
        }
    }

    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }

}
