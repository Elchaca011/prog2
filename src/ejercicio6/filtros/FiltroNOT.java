package ejercicio6.filtros;

import ejercicio6.ElementoBazar;

public class FiltroNOT implements  Filtro {
    Filtro filtro;

    public FiltroNOT(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(ElementoBazar producto) {
        return !filtro.cumple(producto);
    }
}
