package ejercicio3;

import ejercicio3.condiciones.Condicion;

import java.util.ArrayList;

public class CategoriaOSeccion extends ElementoNoticia{
    //atributos
    private String descripcion;
    private String img;
    private ArrayList<ElementoNoticia> elemntosNoticas;


    //constructor
    public CategoriaOSeccion(String nombre, String descripcion, String img){
        super(nombre);
        this.descripcion =descripcion;
        this.img = img;
        elemntosNoticas = new ArrayList<>();
    }

    //metodos
    public void addSecciones(ElementoNoticia elemntoNotica){
        elemntosNoticas.add(elemntoNotica);
    }

    @Override
    public int getCantNoticia() {
        int cantNoticias = 0;
        for (ElementoNoticia elemHijo : this.elemntosNoticas){
            cantNoticias += elemHijo.getCantNoticia();  //recursion
        }
        return cantNoticias;
    }

    @Override
    public ArrayList<ElementoNoticia> buscar(Condicion condicion) {
       ArrayList<ElementoNoticia> retorno = new ArrayList<>();
       for (ElementoNoticia elemHijo: this.elemntosNoticas){
           retorno.addAll(elemHijo.buscar(condicion));  //recursion
       }
       return retorno;
    }

    @Override
    public boolean contienePalabraClave(String pc) {
        return false;
    }


    @Override
    public String toString() {
        return  super.toString();
    }
}
