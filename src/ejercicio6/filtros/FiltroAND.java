package ejercicio6.filtros;

import ejercicio6.ElementoBazar;

public class FiltroAND implements Filtro {
    private Filtro filtro1, filtro2;

    public FiltroAND(Filtro filtro1, Filtro filtro2){
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(ElementoBazar producto) {
        return filtro1.cumple(producto) && filtro2.cumple(producto);
    }
}
