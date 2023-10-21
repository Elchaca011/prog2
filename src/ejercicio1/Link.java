package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.util.ArrayList;

public class Link extends Elemento {
    //Constantes
    private static final String PREFIJO = "link a ";
    private static final double TAMANIO = 1.0;

    //Atributo
    private Elemento referencia;

    //constructor
    public Link(Elemento referencia){
        super(PREFIJO + referencia.getNombre(), referencia.getFechaCreacion());
        this.referencia = referencia;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion condicion) {
        ArrayList<Elemento> retorno = new ArrayList<>();
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }
}
