package ejercicio6;

import ejercicio6.filtros.Filtro;

import java.util.ArrayList;

public class ProductoIndividual extends ElementoBazar {
    private double peso;
    private int precio;
    private ArrayList<String> categorias;

    public ProductoIndividual(String nombreProducto, double peso, int precio){
        super(nombreProducto);
        this.peso = peso;
        this.precio = precio;
        categorias = new ArrayList<>();
    }

    public void addCategoria(String categoria){
        categorias.add(categoria);
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public boolean contieneCategoria(String categoria) {
        return categorias.contains(categoria);
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(categorias);
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    @Override
    public ArrayList<ElementoBazar> buscar(Filtro filtro) {
        ArrayList<ElementoBazar> retorno = new ArrayList<>();
        if (filtro.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }
}
