package ejercicio0.comparadores;

import ejercicio0.Socio;

import java.util.Comparator;

public class ComparadorXNombre implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getNombre().compareTo(socio2.getNombre());
    }
}
