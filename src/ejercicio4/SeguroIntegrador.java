package ejercicio4;

<<<<<<< HEAD
import ejercicio4.filtro.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SeguroIntegrador implements ElementoSeguro {
    private int dni;
    private ArrayList<ElementoSeguro> seguros;

    public SeguroIntegrador(int dni){
        this.dni = dni;
        seguros = new ArrayList<>();
    }

    public ArrayList<ElementoSeguro> getSeguros() {
        return new ArrayList<ElementoSeguro>(seguros);
    }

    public void addSeguros(ElementoSeguro seguro){
        seguros.add(seguro);
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public double getMonto() {
        int monto = 0;
        for(ElementoSeguro s : seguros){
            monto += s.getMonto();
        }
        return monto;
    }

    @Override
    public int getPoliza() {
        int poliza = 0;
        for (ElementoSeguro s : seguros){
            int actual = s.getPoliza();
            if (actual > poliza){
                poliza = actual;
            }
        }
        return poliza;
    }

    @Override
    public String getDescripcion() {
        String des = "";
        for (ElementoSeguro elemHijo : seguros){
            des = elemHijo.getDescripcion();
        }
        return des;
    }

    @Override
    public ArrayList<ElementoSeguro> buscar(Filtro f, Comparator<ElementoSeguro>ordenador) {
        ArrayList<ElementoSeguro> retorno = new ArrayList<>();
        for (ElementoSeguro elemHijo : seguros){
            retorno.addAll(elemHijo.buscar(f, ordenador));

        }
        Collections.sort(retorno,ordenador); //ordena la lista

=======
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
>>>>>>> 2d009d411377b6f2dbe3eb3463195f289c7e5492
        return retorno;
    }
}
