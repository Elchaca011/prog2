package ejercicio1.Condiciones;

import ejercicio1.Elemento;

public class CondicionXNombre implements Condicion {
    private String nombre;

    public CondicionXNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getNombre().equals(nombre);
    }
}
