package ejercicio0.comparadores;

import ejercicio0.Socio;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> c1, c2;

    public ComparadorCompuesto (Comparator<Socio> c1, Comparator<Socio> c2){
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public int compare(Socio s1, Socio s2) {
        if (c1.compare(s1,s2) == 0){
            return c2.compare(s1,s2);
        }
        else {
            return c1.compare(s1,s2);
        }
    }
}
