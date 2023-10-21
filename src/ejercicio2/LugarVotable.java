package ejercicio2;

import java.time.LocalTime;
import java.util.ArrayList;

public class LugarVotable extends  ElementoElectoral{
    //atributo
    private ArrayList<ElementoElectoral> elemenroElectorales;

    //constructor
    public LugarVotable(){
        elemenroElectorales = new ArrayList<>();
    }


    //metodos
    public void addElementoElectoral(ElementoElectoral elemenroElectoral){
        this.elemenroElectorales.add(elemenroElectoral);
    }
    @Override
    public int getCantidadVotos() {
        int cantVotosTotales = 0;
        for (ElementoElectoral elem : this.elemenroElectorales){
            cantVotosTotales += elem.getCantidadVotos(); //recursion
        }
        return cantVotosTotales;
    }

    @Override
    public int getCantidadVotosCandidato(Candidato candidato) {
        int votosCandidato = 0;
        for (ElementoElectoral elemHijo : this.elemenroElectorales) {
            votosCandidato += elemHijo.getCantidadVotosCandidato(candidato);
        }

        return votosCandidato;
    }


    @Override
    public int getCantidadVotosBlanco() {
        int votosTotales = getCantidadVotos();
        int votosEnBlanco = 0;
        for (ElementoElectoral elem : this.elemenroElectorales){
            votosEnBlanco += elem.getCantidadVotosBlanco(); //recursion
        }
        return votosEnBlanco;
    }

}
