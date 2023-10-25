package ejercicio5.Descuentos;

import ejercicio5.ElementoMueble;

public class DescuentoActual implements Descuento {
    private int porcentajeDescuento;

    public DescuentoActual(int porcentajeDescuento){
        this.porcentajeDescuento = porcentajeDescuento;
    }
    @Override
    public double aplicarDescuento(ElementoMueble elementoMueble) {
        return (double) (elementoMueble.getValor() * porcentajeDescuento) / 100;
    }
}
