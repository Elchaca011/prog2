package ejercicio4.condiciones;

import ejercicio4.ElemetoSeguro;
import ejercicio4.EstrategiaCalculo;

public class CalculoMontoFijo implements EstrategiaCalculo {
    private double montoFijo;

    CalculoMontoFijo(double montoFijo){
        this.montoFijo = montoFijo;
    }
    @Override
    public double calular(ElemetoSeguro elemetoSeguro) {
        return montoFijo;
    }
}
