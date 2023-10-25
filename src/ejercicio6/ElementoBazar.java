package ejercicio6;

import ejercicio6.filtros.Filtro;
import java.util.ArrayList;

public abstract class ElementoBazar {
    private String nombreProducto;

    public ElementoBazar(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public abstract int getPrecio();
    public abstract boolean contieneCategoria(String categoria);
    public abstract double getPeso();
    public abstract ArrayList<String> getCategorias();
    public abstract int getCantidad();
    public abstract ArrayList<ElementoBazar>buscar(Filtro filtro);

    public String getNombreProducto() {
        return nombreProducto;
    }

    @Override
    public String toString() {
        return "nombreProducto= " + nombreProducto;
    }
}
