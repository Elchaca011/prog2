package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionXTitulo implements Condicion{
    private String titulo;

    public CondicionXTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equals(titulo);
    }
}
