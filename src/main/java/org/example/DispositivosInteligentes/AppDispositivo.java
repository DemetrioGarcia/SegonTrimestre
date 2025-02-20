package org.example.DispositivosInteligentes;

import java.util.ArrayList;

public class AppDispositivo {
    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Condicioneiro"));
        listaDispositivos.add(new Televisor("TV Cocina"));


        for (Dispositivo dispositivo : listaDispositivos){

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.encender();
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println("__________________________________");
        }

        Dispositivo proyector = new Dispositivo("Proyector") {
            @Override
            public void encender() {
                if (!isEstado()){
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                } else {
                    System.out.println("El proyector ya está encendido.");
                }
            }
        };

        ControlRemoto control_proyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo hornoInteligente = new Dispositivo("Horno LG") {
            @Override
            public void encender() {
                if (!isEstado()){
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                } else {
                    System.out.println("El horno ya está encendido.");
                }
            }
        };

        listaDispositivos.add(proyector);
        listaDispositivos.add(hornoInteligente);


        for (Dispositivo dispositivo : listaDispositivos){

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre()== "Proyector") {
                control_proyector.sincronizar();
            }

            dispositivo.encender();
            dispositivo.mostrarEstado();
            dispositivo.apagar();
            System.out.println("__________________________________");
        }
    }
}
