package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends Elemento {
    //atributo
    private double tamanio;

    //constrcutor
    public Archivo(String nombre, LocalDate fechaCreacion,double tamanio){
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return this.tamanio;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion condicion) {
        ArrayList<Elemento> retorno = new ArrayList<>();
        //si el propio elemento cumple
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tamanio=" + tamanio;
    }
}
