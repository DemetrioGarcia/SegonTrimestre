package org.example.Programame;

public class Pinchazo {
    static java.util.Scanner in;

    public static void casoDePrueba() {
        String texto = in.nextLine();
        String[] camaras = texto.split(" ");
        int[] posiciones = new int[2];

        for (int i = 0; i < posiciones.length; i++) {
            if (Integer.parseInt(camaras[i])>360){
                System.exit(0);
            }
            if (Integer.parseInt(camaras[i])==360)
                posiciones[i]=360;
        }

        if (posiciones[0]-posiciones[1]<180 && posiciones[0]-posiciones[1]!=0){
            System.out.println("ASCENDENTE");
        } else if (posiciones[0]-posiciones[1]>180 && posiciones[0]-posiciones[1]!=0) {
            System.out.println("DESCENDENTE");
        } else{
            System.out.println("Da Igual");
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
