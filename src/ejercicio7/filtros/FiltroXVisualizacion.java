package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroXVisualizacion implements Filtro {
    private int visualizaciones;

    public FiltroXVisualizacion(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return video.getVisualizaciones() > visualizaciones;
    }
}
