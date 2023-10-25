package ejercicio6.filtros;

import ejercicio6.ElementoBazar;

public class FiltroXPeso implements  Filtro {
    private double peso;

    public FiltroXPeso(double peso){
        this.peso = peso;
    }

    @Override
    public boolean cumple(ElementoBazar producto) {
        return producto.getPeso() > peso;
    }
}
