package practico9_ej1;

import practico9_ej1.condiciones.Condicion;

import java.util.ArrayList;
import java.util.Comparator;

public class Club {
    //atributo
    private ArrayList<Socio> socios;

    public Club() {
        socios = new ArrayList<>();
    }

    //metodos
    public void addSocio(Socio socio){
        this.socios.add(socio);
    }

    public ArrayList<Socio> buscar(Condicion condicion , Comparator<Socio> comparador){
        ArrayList<Socio> resultado = new ArrayList<>();
        for (int i = 0 ; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            if (condicion.cumple(socio)){
                resultado.add(socio);
            }
            resultado.sort(comparador);
        }
        return resultado;
    }
}
