package ejercicio4.filtro;

import ejercicio4.ElementoSeguro;


public class FiltroXMonto implements Filtro{
    private int monto;
    public FiltroXMonto(int monto){
        this.monto = monto;
    }
    @Override
    public boolean cumple(ElementoSeguro seguro) {
        return seguro.getMonto() > monto;
    }
}
