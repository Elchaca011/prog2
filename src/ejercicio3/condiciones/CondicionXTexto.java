package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionXTexto implements Condicion {
    private int superior;

    public CondicionXTexto(int superior){
        this.superior = superior;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length() > superior;
    }
}
