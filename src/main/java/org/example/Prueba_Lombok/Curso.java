package org.example.Prueba_Lombok;

import lombok.*;

@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

}
