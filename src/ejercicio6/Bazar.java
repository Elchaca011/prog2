package ejercicio6;

import ejercicio6.filtros.Filtro;

import java.util.ArrayList;

public class Bazar {
    private  String nombre;
    private ArrayList<ElementoBazar> stock;

    public Bazar(String nombre){
        this.nombre = nombre;
        stock = new ArrayList<>();
    }

    public void addStock(ElementoBazar producto){
        stock.add(producto);
    }

    public int getCantidadProductosCombo(Combo combo){
        return combo.getCantidad();
    }

    public double getProductoMenorPesoCombo(Combo combo){
        return combo.getMenorPeso();
    }

    public ArrayList<ElementoBazar> buscar (Filtro filtro){
        ArrayList<ElementoBazar> retorno = new ArrayList<>();
        for (ElementoBazar elemHijo: stock){
           retorno.addAll(elemHijo.buscar(filtro));
        }
        return retorno;
    }
}
