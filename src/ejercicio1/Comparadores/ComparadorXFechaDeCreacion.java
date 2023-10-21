package ejercicio1.Comparadores;

import ejercicio1.Elemento;

import java.util.Comparator;

public class ComparadorXFechaDeCreacion implements Comparator<Elemento> {
    @Override
    public int compare(Elemento elem1, Elemento elem2) {
        return elem1.getFechaCreacion().compareTo(elem2.getFechaCreacion());
    }
}
