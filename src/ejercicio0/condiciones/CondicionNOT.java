package ejercicio0.condiciones;

import ejercicio0.Socio;


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
