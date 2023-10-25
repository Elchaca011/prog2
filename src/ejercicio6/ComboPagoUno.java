package ejercicio6;

public class ComboPagoUno extends Combo {

    public ComboPagoUno(String nombreCombo){
        super(nombreCombo);
    }

    @Override
    public int getPrecio() {
        int cantidadTotal = 0;
        for (ElementoBazar elemnto : super.productos){
            cantidadTotal += elemnto.getPrecio();
        }
        return cantidadTotal;
    }
}
