package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionOR implements Condicion {
    private Condicion con1, con2;

    public CondicionOR(Condicion con1, Condicion con2){
        this.con1 = con1;
        this.con2 = con2;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return con1.cumple(noticia) || con2.cumple(noticia);
    }
}
