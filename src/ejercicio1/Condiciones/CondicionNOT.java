package ejercicio1.Condiciones;

import ejercicio1.Elemento;

public class CondicionNOT implements Condicion{
    private Condicion con;

    public CondicionNOT(Condicion con){
        this.con = con;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return !con.cumple(elemento);
    }
}
