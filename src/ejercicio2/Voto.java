package ejercicio2;

import java.time.LocalDate;

public class Voto {
    //atributos
    private Candidato candidato;
    private LocalDate horaVoto;

    //constructor
    public Voto(Candidato candidato, LocalDate horaVoto){
        this.candidato = candidato;
        this.horaVoto = horaVoto;
    }

    //metodos

    public Candidato getCandidato() {
        return candidato;
    }

    public LocalDate getHoraVoto() {
        return horaVoto;
    }
}
