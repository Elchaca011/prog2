package ejercicio5.Filtros;

import ejercicio5.ElementoMueble;

public class FiltroXDescripcion implements Filtro{
    private String palabra;

    public FiltroXDescripcion(String palabra){
        this.palabra = palabra;
    }
    @Override
    public boolean cumple(ElementoMueble mueble) {
        return mueble.contienePalabra(palabra);
    }
}
