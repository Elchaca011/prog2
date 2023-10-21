package ejercicio2;

public class Votante {
    //atributos
    private String nombre;
    private int dni;
    private Voto voto;

    //constructor
    public Votante(String nombre, int dni, Voto voto){
        this.nombre = nombre;
        this.dni = dni;
        this.voto = voto;
    }

    //metodos


    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Voto getVoto() {
        return voto;
    }

}
