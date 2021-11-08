package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Programador {
    private long id;
    private String nombre;
    private int experiencia;
    private double salario;
    private long id_departamento;
    private List<Lenguaje.Lenguajes> lenguajes;
}
