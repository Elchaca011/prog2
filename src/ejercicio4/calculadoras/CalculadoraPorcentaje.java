package ejercicio4.calculadoras;

import ejercicio4.ElementoSeguro;

public class CalculadoraPorcentaje implements Calculadora {
    private double porcentaje;

    /***
     Los porcentajes se expresan en decimales. Por ejemplo, para 50% ingresar 0.5
     ***/
    public CalculadoraPorcentaje(double p){
        if (p >= 0){
            porcentaje = p;
        }else {
            porcentaje = -p;
        }
    }

    @Override
    public double calcularMonto(ElementoSeguro seguro) {
        return seguro.getMonto() * porcentaje;
    }
}
