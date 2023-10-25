package ejercicio5;

import ejercicio5.Filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoMueble {
    private int id;

    public ElementoMueble(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public abstract boolean contienePalabra(String string);
    public abstract int getMeses();
    public abstract double getValor();

    public abstract ArrayList<ElementoMueble> buscar(Filtro filtro);


    @Override
    public String toString() {
        return "ElementoMueble: " +
                "id= " + id;
    }
}
