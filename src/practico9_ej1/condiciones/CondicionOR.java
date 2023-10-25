package practico9_ej1.condiciones;

import practico9_ej1.Socio;
import practico9_ej1.condiciones.Condicion;

public class CondicionOR implements Condicion {

    private Condicion con1, con2;

    public CondicionOR(Condicion con1, Condicion con2){
        this.con1 = con1;
        this.con2 = con2;
    }

    @Override
    public boolean cumple(Socio socio) {
        return this.con1.cumple(socio) || this.con2.cumple(socio);
    }

}
