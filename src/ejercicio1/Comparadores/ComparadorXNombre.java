package ejercicio1.Comparadores;

import ejercicio1.Elemento;

import java.util.Comparator;

public class ComparadorXNombre implements Comparator<Elemento> {
    @Override
    public int compare(Elemento elem1, Elemento elem2) {
        return elem1.getNombre().compareTo(elem2.getNombre());
    }
}
