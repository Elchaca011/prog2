package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroOR implements Filtro {
    private Filtro filtro1, filtro2;

    public FiltroOR(Filtro f1, Filtro f2) {
        filtro1 = f1;
        filtro2 = f2;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return filtro1.cumple(video) || filtro2.cumple(video);
    }
}
