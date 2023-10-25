package ejercicio1.Condiciones;

import ejercicio1.Elemento;

import java.time.LocalDate;

public class CondicionXFecha implements Condicion {
    private LocalDate fecha;

    public CondicionXFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getFechaCreacion().isBefore(fecha);
    }
}
