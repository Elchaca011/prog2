package ejercicio1.Condiciones;

import ejercicio1.Elemento;

public class CondicionXSubString implements Condicion{
    private String subString;

    public CondicionXSubString(String subString){
        this.subString = subString;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getNombre().contains(subString);
    }
}
