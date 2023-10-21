package practico9_ej1.condiciones;

import practico9_ej1.Socio;

public class CondicionXCancha implements Condicion{
    //Atributo
    private int idCancha;
    //Constructor
    public CondicionXCancha(int idCancha){
        this.idCancha = idCancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquiloCancha(idCancha);
    }
}
