package ejercicio3;

import ejercicio3.condiciones.Condicion;

import java.util.ArrayList;

public abstract class ElementoNoticia {
    //atributos
    private String nombre;


    //constructor
    public ElementoNoticia(String nombre){
        this.nombre = nombre;
    }

    //metodos

    public String getNombre() {
        return nombre;
    }

    public abstract int getCantNoticia();
    public abstract ArrayList<ElementoNoticia>buscar(Condicion condicion);

    public abstract boolean contienePalabraClave(String pc);


    @Override
    public String toString() {
        return  this.nombre + "/";
    }
}
