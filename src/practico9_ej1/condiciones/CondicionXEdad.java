package practico9_ej1.condiciones;

import practico9_ej1.Socio;
import practico9_ej1.condiciones.Condicion;

public class CondicionXEdad implements Condicion {
    //atributo
    private int edadMin;

    public CondicionXEdad(int edadMin){
        this.edadMin = edadMin;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() < this.edadMin;
    }
}
