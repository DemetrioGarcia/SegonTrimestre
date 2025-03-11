package org.example.Programame;

public class Manuel_programame {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        String num = in.next();

        try{
            if (Long.parseLong(num) < 0 || Long.parseLong(num) > Math.pow(10,9)){
                return false;
            }
            else {
                String[] numeros = num.split("");
                long resultado = 0;
                String rest="";

                for (int i = 0; i < numeros.length; i++) {
                    rest=rest+numeros[i];
                    resultado = resultado + Long.parseLong(numeros[i]);

                    if (i == numeros.length-1){
                        rest=rest+" = "+resultado;
                    }else {
                        rest=rest+" + ";
                    }
                }
                System.out.println(rest);

                return true;
            }
        }catch (NumberFormatException e){
            return false;
        }

    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}