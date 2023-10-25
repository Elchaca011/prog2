package ejercicio7;

import ejercicio7.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PlayListConSponsor extends PlayList {
    private ElementoVideo videoSponsor;

    public PlayListConSponsor(String titulo, ElementoVideo videoSponsor){
        super(titulo);
        this.videoSponsor = videoSponsor;
    }

    public void setVideoSponsor(ElementoVideo videoSponsor) {
        this.videoSponsor = videoSponsor;
    }

    @Override
    public ArrayList<ElementoVideo>buscar(Filtro filtro, Comparator<ElementoVideo> ordenador) {
        ArrayList<ElementoVideo> retorno = new ArrayList<>();
        //agrega al principio del resultado un video particular,aunque no cumpla con la condición de búsqueda
        retorno.add(0,videoSponsor);
        for (ElementoVideo elem : videos){
            retorno.addAll(elem.buscar(filtro, ordenador));
        }
        Collections.sort(retorno, ordenador);
        return retorno;
    }
}
