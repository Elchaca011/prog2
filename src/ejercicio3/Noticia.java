package ejercicio3;

import ejercicio3.condiciones.Condicion;

import java.util.ArrayList;

public class Noticia extends CategoriaOSeccion {
    //atributos
    private String titulo;
    private String intro;
    private String texto;
    private String autor;
    private String link;
    private ArrayList<String> palabrasClave;

    //constructor
    public Noticia(String nombre, String descripcion, String img,String titulo, String intro,String texto,String autor, String link){
        super(nombre, descripcion, img);
        this.titulo = titulo;
        this.intro = intro;
        this.texto = texto;
        this.autor = autor;
        this.link = link;
        palabrasClave = new ArrayList<>();
    }

    //metodos


    public void addPalabraClave(String pc){
        this.palabrasClave.add(pc);
    }


    public String getTitulo() {
        return titulo;
    }


    public String getTexto() {
        return texto;
    }


    public String getAutor() {
        return autor;
    }

    @Override
    public int getCantNoticia() {
        return 1;
    }
    @Override
    public boolean contienePalabraClave(String pc){
        return this.palabrasClave.contains(pc);
    }

    @Override
    public ArrayList<ElementoNoticia> buscar(Condicion condicion) {
       ArrayList<ElementoNoticia> retorno = new ArrayList<>();
       //si el propio elemento cumple
       if (condicion.cumple(this))
           retorno.add(this);

       return retorno;
    }

    @Override
    public String toString() {
        return super.toString() + this.link;
    }
}
