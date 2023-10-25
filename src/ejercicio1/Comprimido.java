package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprimido extends Directorio {

    //atributo
    private double tasaComprension;

    //constructor
    public Comprimido(String nombre, LocalDate fechaCreacion, double tasaComprension){
        super(nombre, fechaCreacion);
        this.tasaComprension = tasaComprension;
    }


    @Override
    public double getTamanio() {
        return super.getTamanio() / this.tasaComprension;
    }


    /**
     * Se agrega el comprimido si cumple con la
     * condicion , pero no los elementos que contiene!
     **/
    @Override
    public ArrayList<Elemento> buscar(Condicion condicion) {
        ArrayList<Elemento> retorno = new ArrayList<>();
        if (super.buscar(condicion).size() > 0)
            retorno.add(this);

        return retorno;
    }
}
