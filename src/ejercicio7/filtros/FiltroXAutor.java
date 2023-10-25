package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroXAutor implements Filtro {
    private String nombreAutor;

    public FiltroXAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return video.getNombreUsuario().equals(nombreAutor);
    }
}
