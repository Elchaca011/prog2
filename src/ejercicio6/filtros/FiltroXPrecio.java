package ejercicio6.filtros;

import ejercicio6.ElementoBazar;

public class FiltroXPrecio implements Filtro {
    private int precio;

    public FiltroXPrecio(int precio){
        this.precio = precio;
    }

    @Override
    public boolean cumple(ElementoBazar producto) {
        return producto.getPrecio() < precio;
    }
}
