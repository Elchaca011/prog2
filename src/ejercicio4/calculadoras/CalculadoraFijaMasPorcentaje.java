package ejercicio4.calculadoras;

import ejercicio4.ElementoSeguro;

public class CalculadoraFijaMasPorcentaje implements Calculadora {
    private Calculadora calcuFija, calcuPorcen;

    public CalculadoraFijaMasPorcentaje(Calculadora calcuFija, Calculadora calcuPorcen){
        this.calcuFija = calcuFija;
        this.calcuPorcen = calcuPorcen;
    }

    @Override
    public double calcularMonto(ElementoSeguro seguro) {
        return calcuFija.calcularMonto(seguro) + calcuPorcen.calcularMonto(seguro);
    }
}
