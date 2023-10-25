package ejercicio7;

public class Usuario {
    private String nombre;
    private int anioRegistro;
    private String emial;

    public Usuario(String nombre, int anioRegistro, String emial) {
        this.nombre = nombre;
        this.anioRegistro = anioRegistro;
        this.emial = emial;
    }

    public String getNombre() {
        return nombre;
    }
}
