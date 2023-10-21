package ejercicio4;

import ejercicio4.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElemetoSeguro {
    //atributo
    private int dni;
    private EstrategiaCalculo estrategiaCalculo;

    //constructor
    public ElemetoSeguro( int dni , EstrategiaCalculo estrategiaCalculo){
        this.dni = dni;
        this.estrategiaCalculo = e
    }

    //metodos
    public int getDni() {
        return dni;
    }

    public abstract double getMonto();

    public abstract ArrayList<ElemetoSeguro> buscar(Condicion condicion);
}
