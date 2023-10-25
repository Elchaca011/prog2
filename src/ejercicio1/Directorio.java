package ejercicio1;

import ejercicio1.Condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio extends Elemento {
    //atributo
    private ArrayList<Elemento> elementos;

    //Constructor
    public Directorio(String nombre, LocalDate fechaCreacion){
        super(nombre, fechaCreacion);
        elementos = new ArrayList<>();
    }

    //Metodos

    public void addElemento(Elemento elemento){
        this.elementos.add(elemento);
    }


    public ArrayList<Elemento> buscar(Condicion condicion){
        ArrayList<Elemento> retorno = new ArrayList<>();
        for (int i = 0; i < this.elementos.size(); i++) {
            Elemento elemHijo = this.elementos.get(i);
            retorno.addAll(elemHijo.buscar(condicion));
        }
        return retorno;
    }

    @Override
    public double getTamanio() {
        double tamanio = 0.0;
        for (int i = 0; i < this.elementos.size(); i++) {
            Elemento elemHijo = this.elementos.get(i);
            tamanio+= elemHijo.getTamanio();  //RECURSION
        }
        return tamanio;
    }
}
