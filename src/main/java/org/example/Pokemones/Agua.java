package org.example.Pokemones;

public class Agua extends Pokemon{

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("Pistola Agua");
    }
}
