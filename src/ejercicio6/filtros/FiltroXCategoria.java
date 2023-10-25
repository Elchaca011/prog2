package ejercicio6.filtros;

import ejercicio6.ElementoBazar;

public class FiltroXCategoria implements Filtro {
    private String categoira;

    public FiltroXCategoria(String categoira){
        this.categoira = categoira;
    }

    @Override
    public boolean cumple(ElementoBazar producto) {
        return producto.contieneCategoria(categoira);
    }
}
