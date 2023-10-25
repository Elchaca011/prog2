package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroNOT implements Filtro{
    private Filtro filtro;

    public FiltroNOT(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(ElementoMueble mueble) {
        return !filtro.cumple(mueble);
    }
}
