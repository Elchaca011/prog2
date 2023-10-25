package ejercicio5;

import ejercicio5.Filtros.Filtro;

import java.util.ArrayList;

public class ComboArmado extends ElementoMueble{
    private ArrayList<ElementoMueble> elementos;

    public ComboArmado(int id){
        super(id);
        elementos = new ArrayList<>();
    }

    public void addMueble(ElementoMueble mueble){
        elementos.add(mueble);
    }

    @Override
    public boolean contienePalabra(String string) {
        for (ElementoMueble elem : elementos){
           if (elem.contienePalabra(string)){
               return true;
           }
        }
        return false;
    }

    @Override
    public int getMeses() {
        int antiguedad = 0;
        for (ElementoMueble elem : elementos){
           int actual = elem.getMeses();
           if (actual > antiguedad){
               antiguedad = actual;
           }
        }
        return antiguedad;
    }

    @Override
    public double getValor() {
        int contador = 0;
        for (ElementoMueble elem : elementos){
            contador += elem.getValor();
        }
        return contador;
    }

    @Override
    public ArrayList<ElementoMueble> buscar(Filtro filtro) {
        ArrayList<ElementoMueble> retorno = new ArrayList<>();
        for (ElementoMueble elemHijo : elementos){
            retorno.addAll(elemHijo.buscar(filtro));
        }
        return retorno;
    }


}
