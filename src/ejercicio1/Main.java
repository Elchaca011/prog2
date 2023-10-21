package ejercicio1;

import ejercicio1.Archivo;
import ejercicio1.Comparadores.ComparadorXFechaDeCreacion;
import ejercicio1.Condiciones.CondicionXNombre;
import ejercicio1.Condiciones.CondicionXSubString;
import ejercicio1.Directorio;
import ejercicio1.Link;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Creo el sistema de archivos
        SistemaArchivos miUsuario = new SistemaArchivos();

        //Creo el directorio padre
        Directorio directorioPrincipal = new Directorio("/", LocalDate.of(2010,5,1));

        //Creo algunas sub-directorios
        Directorio subDirectorio1 = new Directorio("PROGRAMACION",LocalDate.of(2014,3,1));
        Directorio subDirectorio2 = new Directorio("IMAGENES", LocalDate.of(2011,11,11));

        //Creo sub-sub-directorios
        Directorio sub_subDirectorio1 = new Directorio("prog1", LocalDate.of(2023,3,12));
        Directorio  sub_subDirectorio2 = new Directorio("prog2", LocalDate.of(2023,8,10));
        Directorio  sub_subDirectorio3 = new Directorio("prog3", LocalDate.of(2024,3,5));

        //Creo algunos elementos simples (archivos, links)
        Archivo archivoIMG1 = new Archivo("img1", LocalDate.of(2011,11,18),2.5);
        Archivo archivoIMG2 = new Archivo("img2", LocalDate.of(2012,12,14),3.5);
        Archivo archivoIMG3 = new Archivo("img3", LocalDate.of(2013,12,11),1.6);

        Archivo archivoPDF1 = new Archivo("parcial prog1",LocalDate.of(2023,6,18),1.5);
        Archivo archivoPDF2 = new Archivo("parcial prog2",LocalDate.of(2023,10,26),2.1);
        Archivo archivoPDF3 = new Archivo("parcial prog3",LocalDate.of(2024,6,6),2.5);

        Link link1 = new Link(archivoIMG1);

        //Añado los comprimidos
        Comprimido comprimido1 = new Comprimido("gtaSa sin virus", LocalDate.of(2012,8,17), 2.2);

        //Creo y añado elementos al comprimido
        Archivo archivoComprimido1 = new Archivo("gtaSa ejecutable", LocalDate.of(2012,8,17), 4.8 );
        Archivo archivoComprimido2 = new Archivo("readme", LocalDate.of(2012,8,17), 1.1);
        comprimido1.addElemento(archivoComprimido1);
        comprimido1.addElemento(archivoComprimido2);




        //añado los elementos a cada directorio corespondiente
        sub_subDirectorio1.addElemento(archivoPDF1);
        sub_subDirectorio2.addElemento(archivoPDF2);
        sub_subDirectorio3.addElemento(archivoPDF3);

        subDirectorio1.addElemento(sub_subDirectorio1);
        subDirectorio1.addElemento(sub_subDirectorio2);
        subDirectorio1.addElemento(sub_subDirectorio3);

        subDirectorio2.addElemento(archivoIMG1);
        subDirectorio2.addElemento(archivoIMG2);
        subDirectorio2.addElemento(archivoIMG3);

        directorioPrincipal.addElemento(subDirectorio1);
        directorioPrincipal.addElemento(subDirectorio2);
        directorioPrincipal.addElemento(link1);
        directorioPrincipal.addElemento(comprimido1);


        //Añado todo al sistema de archivo

        miUsuario.addElemento(directorioPrincipal);


        //Busquedas
        System.out.println(miUsuario.buscar(new CondicionXSubString("img"), new ComparadorXFechaDeCreacion(), 1));

    }
}
