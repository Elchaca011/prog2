package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroxValor implements Filtro{
    private int valorComparador;
    public FiltroxValor(int valorComparador){
        this.valorComparador= valorComparador;
    }

    @Override
    public boolean cumple(ElementoMueble mueble) {
        return mueble.getValor() < valorComparador;
    }
}
