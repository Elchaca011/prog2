package ejercicio3;

import ejercicio3.condiciones.*;

public class Main {
    public static void main(String[] args) {


        //creo algunas secciones y sub-secciones

        CategoriaOSeccion categoriaOSeccionPrincipal = new CategoriaOSeccion("principal", "soy la uno", "img1");

        CategoriaOSeccion seccionDeportes = new CategoriaOSeccion("seccion1", "soy una seccion", "img2");
        CategoriaOSeccion seccionEntretenimienro = new CategoriaOSeccion("seccion2", "soy una seccion", "img3");

        CategoriaOSeccion futbol = new CategoriaOSeccion("sub-seccion1", " soy una sub-seccion", "img4");
        CategoriaOSeccion basuqet = new CategoriaOSeccion("sub-seccion1", " soy una sub-seccion", "img4");
        CategoriaOSeccion granHermano = new CategoriaOSeccion("sub-seccion1", " soy una sub-seccion", "img4");
        CategoriaOSeccion showMatch = new CategoriaOSeccion("sub-seccion1", " soy una sub-seccion", "img4");

        //creo las noticias
        Noticia bokeee = new Noticia("noticia1","boca salio campeon de la libertadores locoo","img4" , "boca salio campeon",
                                        "soy una intro", "soy un texto fachero", "roman", "link1");

        bokeee.addPalabraClave("boke");

        Noticia rivernt = new Noticia("noticia2", "river pierde todo", "img4",
                "f por river ", "river esta en la b", "..", "pisculichint", "link2");

        rivernt.addPalabraClave("boke");
        rivernt.addPalabraClave("river");

        Noticia jordan = new Noticia("noticia3", "tengo unas jordan en los pies", "img4",
                "basquet = jordan", "jordaaaan 23","...", "messi", "link3");

        jordan.addPalabraClave("jordan");

        Noticia ganadorGH = new Noticia("noticia4", "programa echo para gente que fuma faso con tabaco", "..",
                "ultimo momento","soy un intro fachera fecherita", "soy un texto", "alberto fernandez" ,"link4");

        ganadorGH.addPalabraClave("malardo");

        Noticia ganadorSM = new Noticia("noticia5", "no tengo mas ganas de escribir", "..",
                "ultimo momento", "mordecai y rigby...","loremloremlorem", "mordecai", "link5");

        ganadorSM.addPalabraClave("noelia pompa");

        Noticia tineliKPO = new Noticia("noticia6", "tineli nos saca de la crisis", "..",
                "ultimo momento", "un fan de tineli dijo..", "loremlorem", "el novio de tinelli", "link6");

        tineliKPO.addPalabraClave("y tineli soy yo");


        //agrego las noticias a sus respectivas secciones
        futbol.addSecciones(bokeee);
        futbol.addSecciones(rivernt);
        basuqet.addSecciones(jordan);

        granHermano.addSecciones(ganadorGH);
        showMatch.addSecciones(ganadorSM);
        showMatch.addSecciones(tineliKPO);

        seccionDeportes.addSecciones(futbol);
        seccionDeportes.addSecciones(basuqet);

        seccionEntretenimienro.addSecciones(granHermano);
        seccionEntretenimienro.addSecciones(showMatch);

        categoriaOSeccionPrincipal.addSecciones(seccionDeportes);
        categoriaOSeccionPrincipal.addSecciones(seccionEntretenimienro);



        System.out.println(categoriaOSeccionPrincipal.getCantNoticia());

        System.out.println(categoriaOSeccionPrincipal.buscar(new CondicionXPalabraClave("boke")));

        System.out.println(categoriaOSeccionPrincipal.buscar(new CondicionXTexto(10)));

        System.out.println(categoriaOSeccionPrincipal.buscar(new CondicionXAutor("messi")));

        System.out.println(categoriaOSeccionPrincipal.buscar(new CondicionAND(new CondicionXPalabraClave("boke"),
                new CondicionXPalabraClave("river"))));

        System.out.println(categoriaOSeccionPrincipal.buscar(new CondicionXTitulo("ultimo momento")));
    }
}
