package org.example;

public class Editorial {

    private String Nombre;
    private String Pais;

    public Editorial (String Nombre, String Pais){
        this.Nombre = Nombre;
        this.Pais = Pais;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPais() {
        return Pais;
    }

    @Override
    public String toString(){

        return "Editorial : nombre= " +getNombre()+ " pais= "+getPais();
    }
}
