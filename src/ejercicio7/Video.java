package ejercicio7;

import ejercicio4.ElementoSeguro;
import ejercicio7.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Video extends ElementoVideo {
    private Usuario usuario;
    private int duracion;
    private int visualizaciones;
    private int cantMeGusta;
    private int cantNoMeGusta;
    private int anio;
    private ArrayList<String> palabrasClave;

    public Video (String titulo, Usuario usuario, int duracion,
                    int visualizaciones, int cantMeGusta, int cantNoMeGusta, int anio){
        super(titulo);
        this.usuario = usuario;
        this.duracion = duracion;
        this.visualizaciones = visualizaciones;
        this.cantMeGusta = cantMeGusta;
        this.cantNoMeGusta = cantNoMeGusta;
        this.anio = anio;
        palabrasClave = new ArrayList<>();
    }



    public void addPalabraClave(String pc){
        //si la palabra clave no esta repetida
        if (!palabrasClave.contains(pc)){
            palabrasClave.add(pc);
        }
    }

    @Override
    public String getNombreUsuario(){
        return usuario.getNombre();
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public int getCantVideos() {
        return 1;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    @Override
    public ArrayList<ElementoVideo> buscar(Filtro filtro , Comparator<ElementoVideo> ordenador) {
        ArrayList<ElementoVideo> retorno = new ArrayList<>();
        if (filtro.cumple(this)){
            retorno.add(this);
        }
        Collections.sort(retorno, ordenador); //la ordeno

        return retorno;
    }

    @Override
    public int getVisualizaciones() {
        return visualizaciones;
    }

    public int getAnio() {
        return anio;
    }

    public int getCantMeGusta() {
        return cantMeGusta;
    }

    @Override
    public int getCantNoMeGusta() {
        return cantNoMeGusta;
    }

    public boolean contienePalabraClave(String palabra) {
        return palabrasClave.contains(palabra);
    }


}
