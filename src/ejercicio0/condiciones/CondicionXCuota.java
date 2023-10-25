package ejercicio0.condiciones;

import ejercicio0.Socio;


public class CondicionXCuota implements Condicion {
    @Override
    public boolean cumple(Socio socio) {
        return socio.isPago();
    }
}
