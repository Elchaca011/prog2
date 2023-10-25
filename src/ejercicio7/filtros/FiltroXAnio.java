package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroXAnio implements Filtro {
    private int anio;

    public FiltroXAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return video.getAnio() == anio;
    }
}
