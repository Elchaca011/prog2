package ejercicio4.filtro;

import ejercicio4.ElementoSeguro;
import ejercicio4.Seguro;

public interface Filtro {
    boolean cumple(ElementoSeguro seguro);
}
