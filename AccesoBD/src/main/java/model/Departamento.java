package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {
    private long id;
    private String nombre;
    private double presupuesto;
    private Programador jefe;
    private List<Programador> programadores;
}
