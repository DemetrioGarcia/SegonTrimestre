package org.example.HerenciaRedesSociales;

public class Streamer extends Usuario{

    private int num_retrasmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int num_retrasmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.horas_directo = horas_directo;
        this.num_retrasmisiones = num_retrasmisiones;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Información del Streamer:");
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Nombre de Usuario: "+getNombreUsuario());
        System.out.println("Retrasmisiones realizadas: "+num_retrasmisiones);
        System.out.println("Horas de directo: "+horas_directo);
    }
}
