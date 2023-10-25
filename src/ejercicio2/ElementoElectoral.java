package ejercicio2;

import java.time.LocalTime;

public abstract class ElementoElectoral {

    public abstract int getCantidadVotos();
    public abstract int getCantidadVotosCandidato (Candidato candidato);
    public abstract int getCantidadVotosBlanco();

    public double getPorcentajeVotosCandidato (Candidato candidato) {
        int totalVotos = this.getCantidadVotos();
        int votosCandidato = this.getCantidadVotosCandidato(candidato);

        return ((double) votosCandidato / (double) totalVotos) * 100;
    }

    public double getPorcentajeVotosEnBlanco(){
        int totalVotos = this.getCantidadVotos();
        int votosBlanco = this.getCantidadVotosBlanco();

        return ((double) votosBlanco / (double) totalVotos) * 100;
    }


}
