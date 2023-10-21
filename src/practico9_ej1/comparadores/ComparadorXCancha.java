package practico9_ej1.comparadores;

import practico9_ej1.Socio;

import java.util.Comparator;

public class ComparadorXCancha implements Comparator<Socio> {
    //Atributo
    private int idCancha;
    //Constructor
    public ComparadorXCancha(int idCancha){
        this.idCancha = idCancha;
    }
    @Override
    public int compare(Socio socio1, Socio socio2) {
        return socio1.getCantTotalAlquiler(this.idCancha) - socio2.getCantTotalAlquiler(this.idCancha);
    }
}
