package ejercicio0.condiciones;

import ejercicio0.Socio;

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
