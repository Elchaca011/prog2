package ejercicio4.filtro;

import ejercicio4.ElementoSeguro;


public class FiltroXDni implements Filtro{
    private int dni;

    public FiltroXDni(int dni){
        this.dni = dni;
    }

    @Override
    public boolean cumple(ElementoSeguro seguro) {
        return seguro.getDni() == dni;
    }
}
