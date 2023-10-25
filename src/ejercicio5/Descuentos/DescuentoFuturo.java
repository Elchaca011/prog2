package ejercicio5.Descuentos;

import ejercicio5.ElementoMueble;

public class DescuentoFuturo implements Descuento{
    private int porcentajeDescuento;

    public DescuentoFuturo(int porcentajeDescuento){
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(ElementoMueble elementoMueble) {
        return (elementoMueble.getValor() * porcentajeDescuento) / 100;
    }
}
