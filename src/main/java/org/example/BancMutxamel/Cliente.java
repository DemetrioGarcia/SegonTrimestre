package org.example.BancMutxamel;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
public class Cliente {

    Scanner entrada = new Scanner(System.in);
    private static int numClientes = 0;

    private int id;
    private String nombre;
    private String apellidos;

    public Cliente(){
        numClientes++;
        setId(numClientes);
        setNombre();
        setApellidos();
    }

    public void setNombre() {
        System.out.println("Introduce el nombre del cliente: ");
        this.nombre=entrada.next();
    }

    public void setApellidos() {
        System.out.println("Introduce el apellido del cliente: ");
        this.apellidos = entrada.next();
    }

    public void setId(int numClientes) {
        this.id = numClientes;
    }
}


