package ejercicio4;

import ejercicio4.filtro.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class SeguroTemporal implements ElementoSeguro {
    private ElementoSeguro seguro;
    private LocalDate fechaInicio, fechaFin;

    public SeguroTemporal(ElementoSeguro seguro, LocalDate fechaInicio, LocalDate fechaFin){
        this.seguro = seguro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    @Override
    public int getDni() {
        return seguro.getDni();
    }

    @Override
    public double getMonto() {
        if (LocalDate.now().isBefore(fechaFin)) {
            return seguro.getMonto();
        }
        return 0;
    }

    @Override
    public int getPoliza() {
        return seguro.getPoliza();
    }

    @Override
    public String getDescripcion() {
        return seguro.getDescripcion();
    }

    @Override
    public ArrayList<ElementoSeguro> buscar(Filtro f, Comparator<ElementoSeguro> ordenador) {
        ArrayList<ElementoSeguro> retorno = new ArrayList<>();
        if (f.cumple(seguro)){
            retorno.add(seguro);
        }
        return retorno;
    }


}
