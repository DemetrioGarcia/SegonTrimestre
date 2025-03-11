package org.example.Programame;

public class AbuelaMaria {

        static java.util.Scanner entrada;

        public static void main(String[] args) {

            entrada = new java.util.Scanner(System.in);
            int numCasos = entrada.nextInt();
            entrada.nextLine();

            for (int i = 0; i < numCasos; i++)
                casoDePrueba();
        }

        public static void casoDePrueba() {


            int[] vector1 = new int[6];
            int[] vector2 = new int[6];

            String dientesSup = entrada.nextLine();
            String dientesInf = entrada.nextLine();

            String[] VectorSup = dientesSup.split(" ");
            String[] VectorInf = dientesInf.split(" ");

            comprobarEntrada(VectorInf, VectorSup);

            for (int i=0; i < 6; i++){
                vector2[i] = Integer.parseInt(VectorInf[i]);
            }
            for (int i=0; i < 6; i++){
                vector1[i] = Integer.parseInt(VectorSup[i]);
            }

            comprobarEntrada(vector1);
            comprobarEntrada(vector2);

            encajan(vector1,vector2);

        }

        public static void comprobarEntrada(String[] VectorInf, String[] VectorSup){

            if (VectorInf.length!=6 || VectorSup.length!=6){
                System.exit(0);
            }
        }

        public static void comprobarEntrada(int[] vector1){
            for (int i=0; i < 6; i++){
                if(vector1[i]>2000 || vector1[i]<0){
                    System.exit(0);
                }
            }
        }

        public static void encajan(int[] vector1 , int[] vector2){

            int[] suma = new int[6];

            for (int i = 0; i < 6 ; i++){
                suma[i]=vector1[i]+vector2[i];
            }

            if (suma[0] == suma[1] && suma[1]==suma[2] && suma[2]==suma[3] && suma[3]==suma[4] && suma[4]==suma[5]){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
}

