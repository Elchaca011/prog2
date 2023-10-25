package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {
    //atributos
    private String nombre;
    private LocalDate fechaCreacion;

    //Constructor
    public Elemento(String nombre, LocalDate fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public abstract double getTamanio();

    public abstract ArrayList<Elemento> buscar(Condicion condicion);

    @Override
    public String toString() {
        return "Elemento " +
                "nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion;
    }
}
