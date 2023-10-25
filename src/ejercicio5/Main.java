package ejercicio5;

import ejercicio5.Descuentos.DescuentoActual;
import ejercicio5.Descuentos.DescuentoFuturo;
import ejercicio5.Filtros.*;

public class Main {

    public static void main(String[] args) {
        Mueble mueble1 = new Mueble(1,300.00,5,"pepito grillo");
        Mueble mueble2 = new Mueble(2,700.00,10,"juan");
        Mueble mueble3 = new Mueble(3,400.00,3,"messi");
        ComboArmado muebles = new ComboArmado(4);
        ElementoDeprecated muebleDeprecated = new ElementoDeprecated(5, 4, mueble2,
                                                                        new DescuentoActual(2));
        muebleDeprecated.setDescuento(new DescuentoFuturo(5));

        muebles.addMueble(mueble1);
        muebles.addMueble(mueble2);
        muebles.addMueble(mueble3);

        System.out.println(muebleDeprecated.buscar(new FiltroXDescripcion("juan")));

        System.out.println(muebles.buscar(new FiltroAND(new FiltroxValor(650),
                                                            new FiltroxValor(550))));
    }
}
