package ejercicio7.comparadores;

import ejercicio7.ElementoVideo;

import java.util.Comparator;

public class ComparadorXNombreUsuario implements Comparator<ElementoVideo> {
    @Override
    public int compare(ElementoVideo v1, ElementoVideo v2) {
        return v1.getNombreUsuario().compareTo(v2.getNombreUsuario());
    }
}
