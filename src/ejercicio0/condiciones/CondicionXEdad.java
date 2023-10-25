package ejercicio0.condiciones;

import ejercicio0.Socio;

public class CondicionXEdad implements Condicion {
    //atributo
    private int edadMin;

    public CondicionXEdad(int edadMin){
        this.edadMin = edadMin;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.getEdad() < this.edadMin;
    }
}
