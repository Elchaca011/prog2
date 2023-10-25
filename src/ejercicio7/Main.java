package ejercicio7;

import ejercicio7.comparadores.ComparadorXNombreUsuario;
import ejercicio7.filtros.FiltroXAutor;
import ejercicio7.filtros.FiltroXVisualizacion;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Iñaki",2012, "tatigop09@gmail.com");
        Usuario usuario2 = new Usuario("Guillermina",2014, "guille@gmail.com");

        Video video1 = new Video("QUAVO", usuario1, 4, 2400, 24, 0,2018);
        Video video2 = new Video("Pintao", usuario1, 2, 1000, 113, 2,2021);
        Video video3 = new Video("Volcan", usuario2, 3, 6000, 68, 8,2016);
        Video video4 = new Video("Sinoca", usuario2, 4, 1700, 170, 0,2022);

        video1.addPalabraClave("trap");
        video1.addPalabraClave("ysyaaa");
        video2.addPalabraClave("trap");
        video2.addPalabraClave("par de potras");
        video3.addPalabraClave("kuelge");
        video3.addPalabraClave("espiritu lucido");
        video4.addPalabraClave("casino");
        video4.addPalabraClave("kuelge");

        PlayList playListIna = new PlayList("playlist de iña", 4);
        PlayList playListGuille = new PlayList("playlist de guille <3", 6);

        playListIna.addElementoVideo(video1);
        playListIna.addElementoVideo(video2);

        playListGuille.addElementoVideo(video3);
        playListGuille.addElementoVideo(video4);

        PlayList playListInaYGuille = new PlayList("Playlist de guille e iña <3" , 2);
        playListInaYGuille.addElementoVideo(playListIna);
        playListInaYGuille.addElementoVideo(playListGuille);

        System.out.println(playListInaYGuille.buscar(new FiltroXVisualizacion(11), new ComparadorXNombreUsuario())); //1
        System.out.println(playListInaYGuille.getPalabrasClave()); //2 REVISAR
        System.out.println(playListInaYGuille.getCantVideos()); //3
        System.out.println(playListInaYGuille.getDuracion());//4

        //VIDEO SPONSOR
        Video videoSponsor = new Video("SPONSOR", usuario1, 2, 400,0,0, 2023);
        PlayListConSponsor playListConSponsor = new PlayListConSponsor("Soy una playlist con sponsor", videoSponsor);
        playListConSponsor.addElementoVideo(video1);
        playListConSponsor.addElementoVideo(video4);
        System.out.println(playListConSponsor.buscar(new FiltroXAutor("Iñaki") , new ComparadorXNombreUsuario()));

        //VIDEO "CLAVES"
        VideoMentiroso videoMentiroso = new VideoMentiroso("VIDEO MENTIROSO", usuario2,2,14,2,1,2023);
        System.out.println(videoMentiroso.contienePalabraClave("megatron"));

    }
}
