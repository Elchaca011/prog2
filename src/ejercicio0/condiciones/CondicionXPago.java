package ejercicio0.condiciones;

import ejercicio0.Socio;

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
