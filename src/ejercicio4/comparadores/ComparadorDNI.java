package ejercicio4.comparadores;

import ejercicio4.ElementoSeguro;

import java.util.Comparator;

public class ComparadorDNI implements Comparator<ElementoSeguro> {

    @Override
    public int compare(ElementoSeguro s1, ElementoSeguro s2) {
        return s1.getDni() - s2.getDni();
    }
}
