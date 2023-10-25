package ejercicio7;

public class VideoMentiroso extends Video {

    public VideoMentiroso(String titulo, Usuario usuario, int duracion,
                          int visualizaciones, int cantMeGusta, int cantNoMeGusta, int anio) {

        super(titulo, usuario, duracion, visualizaciones, cantMeGusta, cantNoMeGusta, anio);
    }

    @Override
    public boolean contienePalabraClave(String palabra) {
        return true;
    }
}
