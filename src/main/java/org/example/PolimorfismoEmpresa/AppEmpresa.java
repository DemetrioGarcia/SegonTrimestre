package org.example.PolimorfismoEmpresa;

import org.example.HerenciaPersona.Persona;

public class AppEmpresa {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Desarrollador(),
                new Gerente(),
                new Disenyador()
        };

        for (Empleado empleado : empleados ){
            empleado.realizarTarea();
        }

        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();

        asignarTarea(gerente);
        asignarTarea(desarrollador);
    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
