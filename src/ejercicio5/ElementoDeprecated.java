package ejercicio5;


import ejercicio5.Descuentos.Descuento;
import ejercicio5.Filtros.Filtro;

import java.util.ArrayList;

public class ElementoDeprecated extends ElementoMueble{
    private int obsoleto;
    private ElementoMueble contenedor;
    private Descuento descuento;

    public ElementoDeprecated(int id, int obsoleto, ElementoMueble contenedor, Descuento descuento){
        super(id);
        this.obsoleto = obsoleto;
        this.contenedor = contenedor;
        this.descuento = descuento;

    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    @Override
    public boolean contienePalabra(String string) {
        return contenedor.contienePalabra(string);
    }

    @Override
    public int getMeses() {
        return contenedor.getMeses();
    }

    @Override
    public double getValor() {
        if (contenedor.getMeses() < obsoleto){
            return contenedor.getValor();
        }
        else {
            return contenedor.getValor() - descuento.aplicarDescuento(contenedor);
        }
    }

    @Override
    public ArrayList<ElementoMueble> buscar(Filtro filtro) {
        ArrayList<ElementoMueble> retorno = new ArrayList<>();
        if (filtro.cumple(contenedor)){
            retorno.add(contenedor);
        }
        return retorno;
    }
}
