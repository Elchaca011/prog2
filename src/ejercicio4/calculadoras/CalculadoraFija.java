package ejercicio4.calculadoras;

import ejercicio4.ElementoSeguro;

public class CalculadoraFija implements Calculadora {

    @Override
    public double calcularMonto(ElementoSeguro seguro) {
        return seguro.getMonto();
    }
}
