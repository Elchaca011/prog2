package ejercicio4.filtro;

import ejercicio4.ElementoSeguro;


public class FiltroXPalabra implements Filtro {
    private String subString;

    public FiltroXPalabra(String subString){
        this.subString = subString;
    }
    @Override
    public boolean cumple(ElementoSeguro seguro) {
        return seguro.getDescripcion().contains(subString);
    }
}
