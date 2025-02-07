package org.example.Practica1;

import lombok.ToString;

public class Empleado {

    private static int numeroEmpleado = 0;
    private String CARGODEFAULT = "pte";

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = generarID();
        this.nombre = nombre;
       setCargo(cargo);
        this.director = director;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (ValidarCargo(cargo)) {
            this.cargo = cargo;
        } else {
            this.cargo = CARGODEFAULT;
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    private String generarID() {
        numeroEmpleado++;
        if (numeroEmpleado < 10) {
            return "EP00" + numeroEmpleado;
        } else if (numeroEmpleado < 100) {
            return "EP0" + numeroEmpleado;
        } else {
            return "EP" + numeroEmpleado;
        }
    }

    private boolean ValidarCargo(String cargo) {
        return cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador");
    }

    public String toString() {
        return "Empleado( id=" + this.getId() + ", nombre=" + this.getNombre() + ", cargo=" + this.getCargo() + ", director=" + String.valueOf(this.getDirector()) + ")";
    }

}
