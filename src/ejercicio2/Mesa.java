package ejercicio2;

import java.time.LocalTime;
import java.util.ArrayList;

public class Mesa extends ElementoElectoral{
    //atributos
    private ArrayList<Votante> padron;
    private ArrayList<Voto> votos;

    //constructor
    public Mesa(){
        padron = new ArrayList<>();
        votos = new ArrayList<>();
    }

    //metodos
    public void addPadron(Votante votante){
        this.padron.add(votante);
    }

    public boolean votantePuedeVotar(Votante votante){
        return this.padron.contains(votante);
    }

    public void addVoto(Votante votante){
        if (this.votantePuedeVotar(votante)){
            this.votos.add(votante.getVoto());
        }
    }

    @Override
    public int getCantidadVotos() {
        return this.votos.size();
    }


    @Override
    public int getCantidadVotosCandidato(Candidato candidato) {
        int votosTotales = getCantidadVotos();
        int votosCandidato = 0;
        for (Voto voto : this.votos) {
            if (voto.getCandidato() != null && voto.getCandidato().equals(candidato))
                votosCandidato++;
        }
        return votosCandidato;
    }



    @Override
    public int getCantidadVotosBlanco () {
        int votosTotales = getCantidadVotos();
        int votosEnBlanco = 0;
        for (Voto voto : this.votos){
            if (voto.getCandidato() == null)
                votosEnBlanco++;
        }
        return votosEnBlanco;
    }

}
