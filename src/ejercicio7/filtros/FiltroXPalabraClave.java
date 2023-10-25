package ejercicio7.filtros;

import ejercicio7.ElementoVideo;

public class FiltroXPalabraClave implements Filtro {
    private String pc;
    public FiltroXPalabraClave(String pc){
        this.pc = pc;
    }

    @Override
    public boolean cumple(ElementoVideo video) {
        return video.contienePalabraClave(pc);
    }
}
