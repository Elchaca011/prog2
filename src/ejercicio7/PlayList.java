package ejercicio7;

import ejercicio7.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayList extends ElementoVideo{
    private int demoraCraga;
    protected ArrayList<ElementoVideo> videos;

    public PlayList(String titloPlayList) {
        super(titloPlayList);
        videos = new ArrayList<>();
    }

    public PlayList(String titloPlayList,int demoraCraga) {
        super(titloPlayList);
        this.demoraCraga = demoraCraga;
        videos = new ArrayList<>();
    }

    public int getDemoraCraga() {
        return demoraCraga;
    }

    public void setDemoraCraga(int demoraCraga) {
        this.demoraCraga = demoraCraga;
    }

    public void addElementoVideo(ElementoVideo elementoVideo){
        videos.add(elementoVideo);
    }

    @Override
    public String getNombreUsuario() {
       return null;
    }

    @Override
    public int getDuracion() {
        int duracionTotal = 0;
        for (ElementoVideo elem : videos){
            duracionTotal += elem.getDuracion();
        }
        return demoraCraga + duracionTotal;
    }

    @Override
    public int getVisualizaciones() {
        int cantidadTotalVisulaizaciones = 0;
        for (ElementoVideo elem : videos){
            cantidadTotalVisulaizaciones += elem.getVisualizaciones();
        }
        return cantidadTotalVisulaizaciones;
    }

    @Override
    public int getCantMeGusta() {
        int cantidadTotalMG = 0;
        for (ElementoVideo elem : videos){
            cantidadTotalMG += elem.getCantMeGusta();
        }
        return cantidadTotalMG;
    }

    @Override
    public int getCantNoMeGusta() {
        int cantidadTotaNOlMG = 0;
        for (ElementoVideo elem : videos){
            cantidadTotaNOlMG += elem.getCantNoMeGusta();
        }
        return cantidadTotaNOlMG;
    }

    @Override
    public int getAnio() {
        return 0;
    }

    @Override
    public boolean contienePalabraClave(String palabra) {
        return false;
    }

    @Override
    public int getCantVideos() {
        int cantidadTotalVideos = 0;
        for (ElementoVideo elem : videos){
            cantidadTotalVideos += elem.getCantVideos();
        }
        return cantidadTotalVideos;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabrasClave = new ArrayList<>();
        for (ElementoVideo elem : videos){
            if (!palabrasClave.equals(elem.getPalabrasClave())){
                palabrasClave.addAll(elem.getPalabrasClave());
            }
        }
        return palabrasClave;
    }

    @Override
    public ArrayList<ElementoVideo> buscar(Filtro filtro , Comparator<ElementoVideo> ordenador) {
        ArrayList<ElementoVideo> retorno = new ArrayList<>();
        for (ElementoVideo elem : videos){
            retorno.addAll(elem.buscar(filtro , ordenador));
        }
        Collections.sort(retorno, ordenador);
        return retorno;
    }
}
