package ejercicio0.condiciones;

import ejercicio0.Socio;

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
