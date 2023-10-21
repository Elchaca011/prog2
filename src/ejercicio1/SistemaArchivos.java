package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SistemaArchivos {
    //atributo
    private ArrayList<Elemento> elementos;

    //Constructor
    public SistemaArchivos(){
        elementos = new ArrayList<>();
    }

    //Metodos
    public void addElemento(Elemento elemento){
        this.elementos.add(elemento);
    }


    public ArrayList<Elemento> buscar(Condicion condicion, Comparator<Elemento> comparador, int orden){
        ArrayList<Elemento> retorno = new ArrayList<>();
        for (int i = 0; i < this.elementos.size(); i++) {
            Elemento elemHijo = this.elementos.get(i);
            retorno.addAll(elemHijo.buscar(condicion)); //RECURSION
            if (orden > 0){
                Collections.sort(retorno, comparador);
            }
            else {
                Collections.sort(retorno, comparador.reversed());
            }
        }
        return retorno;
    }
}
