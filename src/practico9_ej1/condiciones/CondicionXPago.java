package practico9_ej1.condiciones;

import practico9_ej1.Socio;
import practico9_ej1.condiciones.Condicion;

public class CondicionXPago implements Condicion {
    private int precio;

    public CondicionXPago(int precio){
        this.precio = precio;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getPrecioCancha() > this.precio;
    }
}
