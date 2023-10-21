package practico9_ej1.condiciones;

import practico9_ej1.Socio;


public class CondicionXCuota implements Condicion {
    @Override
    public boolean cumple(Socio socio) {
        return socio.isPago();
    }
}
