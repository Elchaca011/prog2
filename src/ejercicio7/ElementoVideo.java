package ejercicio7;

import ejercicio4.ElementoSeguro;
import ejercicio7.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementoVideo {
    private String titulo;

    public ElementoVideo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public abstract String getNombreUsuario();
    public abstract int getDuracion();
    public abstract int getVisualizaciones();
    public abstract int getCantMeGusta();
    public abstract int getCantNoMeGusta();
    public abstract int getAnio();
    public abstract boolean contienePalabraClave(String palabra);
    public abstract int getCantVideos();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<ElementoVideo> buscar(Filtro filtro, Comparator<ElementoVideo> ordenador);

    @Override
    public String toString() {
        return  "titulo = " + titulo;
    }
}
