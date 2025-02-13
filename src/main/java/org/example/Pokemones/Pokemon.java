package org.example.Pokemones;

abstract class Pokemon {

    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps){
        this.nivel = nivel;
        this.ps = ps;
    }

    public abstract void atacar();

    public void imprimirDatos(){
        System.out.println(" nivel= "+nivel+" puntos de salud: "+ps);
    }
}
