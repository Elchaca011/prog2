package ejercicio2;

public class Candidato {
    //atributos
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    //Constructor
    public Candidato(String nombre, String partidoPolitico, String agrupacion){
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    //metodos

    public String getNombre() {
        return nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }
}
