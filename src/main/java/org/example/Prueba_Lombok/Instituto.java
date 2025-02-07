package org.example.Prueba_Lombok;

import lombok.*;
import java.util.ArrayList;
import java.util.Objects;
//@AllArgsConstructor

@AllArgsConstructor
@ToString
@Getter @Setter
public class Instituto {

    @NonNull
    private final String nombre;
    private String poblacion;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;

    public Instituto (String nombre){
        this.nombre = Objects.requireNonNullElse(nombre,"Instituto sin nombre") ;
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if (cursos.contains(curso)){
            System.out.println("El curso no puede estar repetido");
        } else if (curso != null){
            cursos.add(curso);
        } else {
            System.out.println("El curso no puede ser nulo.");
        }
    }

    public void quitarCurso(Curso curso){
        cursos.remove(curso);
    }

    public void agregarEstudiante(Estudiante estudiante){
        if (estudiantes.contains(estudiante)){
            System.out.println("El estudiante no puede estar repetido");
        } else if (estudiante != null) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El estudiante no puede ser nulo.");
        }
    }

    public void quitarEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }
}