package org.example;

    public class Persona{

        private String nombre;
        private String apellido;
        private String dni;
        private int peso;
        private int edad;
        private String ciudad;
        private String profesion;

        public Persona(){

        }

        public Persona(String nombre, String apellido, String dni, int peso, int edad){

            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.peso = peso;
            this.edad = edad;
        }

        public String getNombre(){
            return this.nombre;
        }

        public String getApellido(){
            return this.apellido;
        }

        public String getdni(){
            return this.dni;
        }

        public int getPeso(){
            return this.peso;
        }

        public int getedad(){
            return this.edad;
        }

        public String getProfesion(){
            return this.profesion;
        }

        public String getCiudad(){
            return this.ciudad;
        }

        public void setNombre(String nombre){
            this.nombre= nombre;
        }

        public void setApellido(String apellido){
            this.apellido=apellido;
        }

        public void setdni(String dni){
            this.dni=dni;
        }

        public void setPeso(int peso){
           this.peso=peso;
        }

        public void setedad(int edad){
            this.edad=edad;
        }

        public void setCiudad(String ciudad){
            this.ciudad=ciudad;
        }

        public void setProfesion(String profesion){
            this.profesion=profesion;
        }
    }

