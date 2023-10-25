package ejercicio0.comparadores;

import ejercicio0.Socio;

import java.util.Comparator;

public class ComparadorXEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getEdad() - socio2.getEdad();
    }
}
