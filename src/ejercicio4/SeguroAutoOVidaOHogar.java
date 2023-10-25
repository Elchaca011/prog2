package ejercicio4;

import ejercicio4.condiciones.Condicion;

import java.util.ArrayList;

public class SeguroAutoOVidaOHogar extends ElemetoSeguro {
    private int numeroPoliza;
    private double monto;
    private String descripcion;
    public SeguroAutoOVidaOHogar(int dni, EstrategiaCalculo estrategiaCalculo, int numeroPoliza, double monto, String descripcion){
        super(dni, estrategiaCalculo);
        this.numeroPoliza = numeroPoliza;
        this.monto = monto;
        this.descripcion = descripcion;
    }


    //metodos
    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public boolean contienePalabra(String palabra){
        return this.descripcion.contains(palabra);
    }


    @Override
    public ArrayList<ElemetoSeguro> buscar(Condicion condicion) {
        ArrayList<ElemetoSeguro> retorno = new ArrayList<>();
        if (condicion.cumple(this))
            retorno.add(this);

        return retorno;
    }
}
