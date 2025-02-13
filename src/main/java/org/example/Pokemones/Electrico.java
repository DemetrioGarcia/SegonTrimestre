package org.example.Pokemones;

public class Electrico extends Pokemon {

    public Electrico(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("IMPACTRUENOO");
    }

}
