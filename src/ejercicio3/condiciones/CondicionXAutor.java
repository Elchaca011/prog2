package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionXAutor implements Condicion{
    private String autor;

    public CondicionXAutor(String autor){
        this.autor = autor;
    }
    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(autor);
    }
}
