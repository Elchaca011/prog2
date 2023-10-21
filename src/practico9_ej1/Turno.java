package practico9_ej1;

import java.time.LocalDate;

public class Turno {
    //atributos
    private LocalDate fechaDeAlquiler;
    private int id;
    private int costo;

    //Constructor
    public Turno(LocalDate fechaDeAlquiler, int id, int costo){
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.id = id;
        this.costo = costo;
    }

    //metodos
    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public int getId() {
        return id;
    }

    public int getPago() {
        return costo;
    }
}
