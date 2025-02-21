package org.example.HerenciaPersona;

class Artista extends Persona {

    private String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) throws EdadMinimaException {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Artista: Preparando el show");
    }
}
