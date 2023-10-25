package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroXMG implements Filtro {
    private int mg;

    public FiltroXMG(int mg) {
        this.mg = mg;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return video.getCantMeGusta() > mg;
    }
}
