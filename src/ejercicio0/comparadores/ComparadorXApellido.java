package ejercicio0.comparadores;

import ejercicio0.Socio;

import java.util.Comparator;

public class ComparadorXApellido implements Comparator<Socio> {
    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getApellido().compareTo(s2.getApellido());
    }
}
