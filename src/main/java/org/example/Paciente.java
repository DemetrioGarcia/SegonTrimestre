package org.example;

import java.awt.font.TextHitInfo;
import java.util.Random;

public class Paciente {

    private final static char DEF_SEXO = 'X' ;
    private final static int SOBREPESO = 1;
    private final static int ANEMIA = -1;
    private final static int PESO_OPTIMO = 0;
    private final static int MAYOR_EDAD = 18;


    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private float peso;
    private float altura;

    public Paciente(String nombre, int edad, char sexo, float peso, float altura){

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    public Paciente(){

            this("",0,DEF_SEXO,0,0);
    }

    public Paciente(String nombre, int edad, char sexo){
        this(nombre, edad, sexo, 0,0);
    }

    private void setNombre(String nombre){
        this.nombre=nombre;
    }

    private void setEdad(int edad){
        this.edad = edad;
    }

    private void setSexo(char sexo){
        comprobarSexo(sexo);
    }

    private void setPeso(float peso){
        this.peso = peso;
    }

    private void setAltura(float altura){
        this.altura = altura;
    }


    public void mostrarPaciente(){

        System.out.println("Paciente: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Género: "+this.sexo);
        System.out.println("DNI: "+this.DNI);
        System.out.println("Peso: "+this.peso+" g");
        System.out.println("Altura: "+this.altura+" m");
    }

    private void generarDNI(){

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        Random random = new Random();
        int num = random.nextInt(10000000,99999999);
        String numDNI = Integer.toString(num);
        char letra = letras[num%23];
        this.DNI = numDNI+letra;
    }

    public int calcIMC(){
        double imc = peso/Math.pow(altura,2);

        if (imc>25){
            return SOBREPESO;
        } else if (imc < 20) {
            return ANEMIA;
        }
        else {
            return PESO_OPTIMO;
        }
    }

    public boolean esMayorDeEdad(){

        if (edad>MAYOR_EDAD){
            return true;
        }else {
            return false;
        }
    }

    private void comprobarSexo(char sexo){

        if (sexo != 'H' && sexo != 'M'){
            this.sexo = DEF_SEXO;
        }else {
            this.sexo = sexo;
        }
    }

    public static void comprobarPeso(Paciente paciente){

        int imc = paciente.calcIMC();

        if (imc==0){
            System.out.println("Peso ideal");
        } else if (imc == 1) {
            System.out.println("Tiene SOBREPESO");
        }
        else {
            System.out.println("Usted esta en las últimas");
        }
    }

    @Override
    public String toString(){

        return "Paciente con nombre: "+this.nombre+" y edad: "+this.edad+ " con genero: "+this.sexo+" y DNI: "+this.DNI+ ". Con peso: "+this.peso+" y altura: "+this.altura;
    }
}
