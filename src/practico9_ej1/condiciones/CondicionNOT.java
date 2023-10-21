package practico9_ej1.condiciones;

import practico9_ej1.Socio;


public class CondicionNOT implements Condicion {
    private Condicion con;

    public CondicionNOT(Condicion con){
        this.con = con;
    }

    @Override
    public boolean cumple(Socio socio) {
        return !this.con.cumple(socio);
    }
}
