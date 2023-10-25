package ejercicio4;

import ejercicio4.filtro.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public interface ElementoSeguro {
    int getDni();
    double getMonto();
    int getPoliza();
    String getDescripcion();
    ArrayList<ElementoSeguro> buscar(Filtro f, Comparator<ElementoSeguro> ordenador);

}
