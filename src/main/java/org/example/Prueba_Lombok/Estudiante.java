package org.example.Prueba_Lombok;

import lombok.*;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
