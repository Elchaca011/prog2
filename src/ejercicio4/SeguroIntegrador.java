package ejercicio4;

import ejercicio4.condiciones.Condicion;

import java.util.ArrayList;

public class SeguroIntegrador extends ElemetoSeguro{
    //atrbuto
    private ArrayList<ElemetoSeguro> seguros;

    //constructor
    public SeguroIntegrador(int dni, EstrategiaCalculo estrategiaCalculo){
        super(dni, estrategiaCalculo);
        seguros = new ArrayList<>();
    }



    @Override
    public ArrayList<ElemetoSeguro> buscar(Condicion condicion) {
        ArrayList<ElemetoSeguro> retorno = new ArrayList<>();
        for (ElemetoSeguro elemetoSeguro : this.seguros){
            retorno.addAll(elemetoSeguro.buscar(condicion));
        }
        return retorno;
    }
}
