package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroNOT implements Filtro {
    private Filtro filtro;

    public FiltroNOT(Filtro filtro){
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return !filtro.cumple(video);
    }
}
