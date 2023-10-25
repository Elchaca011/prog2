package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroXId implements Filtro{
    private int idComparador;

    public FiltroXId(int idComparador){
        this.idComparador = idComparador;
    }

    @Override
    public boolean cumple(ElementoMueble mueble) {
        return mueble.getId() == idComparador;
    }
}
