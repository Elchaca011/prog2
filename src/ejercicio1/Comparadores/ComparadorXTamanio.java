package ejercicio1.Comparadores;

import ejercicio1.Elemento;

import java.util.Comparator;

public class ComparadorXTamanio implements Comparator<Elemento> {
    @Override
    public int compare(Elemento elem1, Elemento elem2) {
        return (int) ( elem1.getTamanio() - elem2.getTamanio() );
    }
}
