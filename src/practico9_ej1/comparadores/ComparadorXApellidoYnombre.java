package practico9_ej1.comparadores;

import practico9_ej1.Socio;

import java.util.Comparator;

public class ComparadorXApellidoYnombre implements Comparator<Socio> {

    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getApellidoYnombre().compareTo(socio2.getApellidoYnombre());
    }
}
