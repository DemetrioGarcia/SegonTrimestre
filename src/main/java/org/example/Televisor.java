package org.example;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor(){
        this(1,5);
    }

    public Televisor(int valorCanal, int valorVolumen) {
        setCanal(valorCanal);
        setVolumen(valorVolumen);
    }

    public void subirCanal() {
        if (canal < 99) {
            this.canal = canal + 1;
        }
        mostrarCanal();
    }

    public void bajarCanal(){
        if (canal > 1) {
            this.canal = canal - 1;
        }
        mostrarCanal();
    }

    public int getCanal(){
        return this.canal;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int valorVolumen){
        if (valorVolumen >= 1 && valorVolumen < 100) {
            this.volumen = valorVolumen;
        }
        else {
            this.volumen = 5;
        }
        mostrarVolumen();
    }

    public void setCanal(int valorCanal){
        if (valorCanal >= 1 && valorCanal < 100) {
            this.canal = valorCanal;
        }
        else {
            this.canal = 1;
        }
        mostrarCanal();
    }

    public void mostrarCanal(){
        System.out.println("El canal es: " + canal);
    }

    public void mostrarVolumen(){
        System.out.println("El volumen es: "+ volumen);
    }

    public static void AplicacionTv(){
        Televisor tele1 = new Televisor();
        Televisor tele2 = new Televisor(23,10);
        System.out.println(tele1.getCanal() + " " + tele1.getVolumen());
        System.out.println(tele2.getCanal() + " " + tele2.getVolumen());
        tele1.setCanal(20);
        tele1.setVolumen(3);
        System.out.println(tele1.getCanal() + " " + tele1.getVolumen());
    }
}
