package practico9_ej1.comparadores;

import practico9_ej1.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> comp1, comp2;

    public ComparadorCompuesto (Comparator<Socio> comp1, Comparator<Socio> comp2){
        this.comp1 = comp1;
        this.comp2 = comp2;
    }


    @Override
    public int compare(Socio socio1, Socio socio2) {
        if (comp1.compare(socio1,socio2) != 0){
            return comp1.compare(socio1,socio2);
        }
        else{
            return comp2.compare(socio1,socio2);
        }
    }
}
