package practico9_ej1;

import java.util.ArrayList;

public class Socio {
    //atributos
    private String apellidoYnombre;
    private int edad;
    private boolean pago;
    private ArrayList<Turno> turnosAlquilados;


    //Constructor
    public Socio(String apellidoYnombre,  int edad, boolean pago){
        this.apellidoYnombre = apellidoYnombre;
        this.edad = edad;
        this.pago = pago;
        turnosAlquilados = new ArrayList<>();
    }

    //Metdos

    public String getApellidoYnombre() {
        return apellidoYnombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isPago() {
        return pago;
    }

    public void addTurno(Turno turno){
        this.turnosAlquilados.add(turno);
    }

    public boolean alquiloCancha(int idCancha){
        for (int i =0; i < turnosAlquilados.size(); i++){
            Turno turno = this.turnosAlquilados.get(i);
            if (turno.getId() == idCancha)
                return true;
        }
        return false;
    }

    public int getCantTotalAlquiler(int idCancha){
        int cant = 0;
        for (int i = 0; i < turnosAlquilados.size(); i++) {
            Turno turno = turnosAlquilados.get(i);
            if (turno.getId() == idCancha){
                cant++;
            }
        }
        return cant;
    }

    public int getPrecioCancha(){
        int precioCancha = 0;
        for (int i = 0; i < turnosAlquilados.size() ; i++) {
            Turno turno = this.turnosAlquilados.get(i);
            precioCancha = turno.getPago();
        }
        return precioCancha;
    }

    @Override
    public String toString() {
        return "Socio" +
                " apellidoYnombre='" + apellidoYnombre + '\'' +
                ", edad=" + edad +
                ", pago=" + pago ;
    }
}
