package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionXPalabraClave implements Condicion{
    private String palabraClave;

    public CondicionXPalabraClave(String palabraClave){
        this.palabraClave = palabraClave;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabraClave(palabraClave);
    }
}
