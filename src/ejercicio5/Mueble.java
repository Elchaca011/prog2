package ejercicio5;

import ejercicio5.Filtros.Filtro;

import java.util.ArrayList;

public class Mueble extends ElementoMueble{
    private double valor;
    private int antiguedad;
    private String descripcion;

    public Mueble(int id, double valor, int antiguedad, String descripcion){
        super(id);
        this.valor = valor;
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
    }
    @Override
    public boolean contienePalabra(String string) {
        return descripcion.contains(string);
    }

    @Override
    public int getMeses() {
        return antiguedad;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public ArrayList<ElementoMueble> buscar(Filtro filtro) {
        ArrayList<ElementoMueble> retorno = new ArrayList<>();
        if (filtro.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }
}
