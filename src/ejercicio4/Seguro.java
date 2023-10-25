package ejercicio4;

import ejercicio4.calculadoras.Calculadora;
import ejercicio4.filtro.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class Seguro implements ElementoSeguro {
    private int dni;
    private String descripcion;
    private double monto;
    private int poliza;
    private Calculadora calculadora;

    public Seguro(int dni, String descripcion, double monto, int poliza, Calculadora calculadora){
        this.dni = dni;
        this.descripcion = descripcion;
        this.monto = monto;
        this.poliza = poliza;
        this.calculadora = calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int getDni() {
        return dni;
    }

    public double calcularMonto(){
        return calculadora.calcularMonto(this);
    }
    @Override
    public double getMonto() {
        return this.monto;
    }

    @Override
    public int getPoliza() {
        return poliza;
    }

    @Override
    public ArrayList<ElementoSeguro> buscar(Filtro f, Comparator<ElementoSeguro> ordenador) {
        ArrayList<ElementoSeguro> retorno = new ArrayList<>();
        if (f.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Seguro" +
                "dni=" + dni +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", poliza=" + poliza;
    }
}
