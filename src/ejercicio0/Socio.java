package ejercicio0;

import java.util.ArrayList;

public class Socio {
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private boolean pago;
    private ArrayList<Turno> turnosAlquilados;


    //Constructor
    public Socio(String nombre,String apellido  ,  int edad, boolean pago){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pago = pago;
        turnosAlquilados = new ArrayList<>();
    }

    //Metdos


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido ;
    }
}
