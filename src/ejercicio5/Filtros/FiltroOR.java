package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroOR implements Filtro{
    private Filtro filtro1, filtro2;

    public FiltroOR(Filtro f1 , Filtro f2){
        filtro1 = f1;
        filtro2 = f2;
    }

    @Override
    public boolean cumple(ElementoMueble mueble) {
        return filtro1.cumple(mueble) || filtro2.cumple(mueble);
    }
}
