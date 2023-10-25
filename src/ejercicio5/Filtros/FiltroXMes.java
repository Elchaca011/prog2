package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroXMes implements Filtro{
    private int mesComparador;

    public FiltroXMes(int mesComparador){
        this.mesComparador = mesComparador;
    }
    @Override
    public boolean cumple(ElementoMueble mueble) {
        return mueble.getMeses() > mesComparador;
    }
}
