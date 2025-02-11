package org.example.HerenciaRedesSociales;

public class RedSocial {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Ana",30,"@ana", 231);
        Influencer infl1 = new Influencer("Luis", 25, "@luis_influiencer",50000);
        infl1.agregarColaboraciones("MediaMarket", "Yoigo", "Temu");
        Streamer streamer1 = new Streamer("Carlos",27, "@carlos_stream",0,150,2000 );
        Basico basic1 = new Basico("Pedro", 22, "@pedro123", 455);

        user1.mostrarInfo();
        System.out.println();
        infl1.mostrarInfo();
        System.out.println();
        streamer1.mostrarInfo();
        System.out.println();
        basic1.mostrarInfo();

    }
}
