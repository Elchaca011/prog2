package ejercicio1.Condiciones;

import ejercicio1.Elemento;

public class CondicionAND implements Condicion{
    private Condicion con1, con2;

    public CondicionAND(Condicion con1, Condicion con2){
        this.con1 = con1;
        this.con2 = con2;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return con1.cumple(elemento) && con2.cumple(elemento);
    }
}
