package ejercicio3.condiciones;

import ejercicio3.Noticia;

public class CondicionNOT implements Condicion{
    private Condicion con;

    public CondicionNOT(Condicion con){
        this.con = con;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return !con.cumple(noticia);
    }
}
