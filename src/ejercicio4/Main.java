package ejercicio4;

import ejercicio4.calculadoras.CalculadoraFija;
import ejercicio4.calculadoras.CalculadoraPorcentaje;
import ejercicio4.comparadores.ComparadorPoliza;
import ejercicio4.filtro.FiltroXDni;
import ejercicio4.filtro.FiltroXMonto;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Seguro s1 = new Seguro(2,"hola como estas", 200, 45, new CalculadoraPorcentaje(20.0));
        Seguro s2 = new Seguro(3,"hola como estas", 200, 44, new CalculadoraFija());
        SeguroIntegrador s3 = new SeguroIntegrador(45);
        SeguroTemporal s4 = new SeguroTemporal(s1, LocalDate.now(),LocalDate.of(2024,5,7));
        s3.addSeguros(s1);
        s3.addSeguros(s2);


        System.out.println(s3.buscar(new FiltroXDni(2), new ComparadorPoliza()));
        System.out.println(s3.buscar(new FiltroXMonto(50), new ComparadorPoliza()));
        //System.out.println(s4.getCostoPoliza);

    }
}
