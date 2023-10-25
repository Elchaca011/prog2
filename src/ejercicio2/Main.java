package ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //creo los candidatos a presidente
        Candidato candidato1 = new Candidato("Masa","Juntos por el cambio", "chorro");
        Candidato candidato2 = new Candidato("Milei","Leones ", "posible heroe");
        Candidato candidato3 = new Candidato("Bulrrich","Cambiemos", "Garca");


        Voto votoNulo = new Voto(null, LocalDate.now());

        //creo a los votantes
        Votante votante1 = new Votante("Jorge",40910014, new Voto(candidato1, LocalDate.now()));
        Votante votante2 = new Votante("Manuel",42102456, new Voto(candidato2, LocalDate.now()));
        Votante votante3 = new Votante("Iñaki",43909013, new Voto(candidato2, LocalDate.now()));
        Votante votante4 = new Votante("Guillermina",45905125, votoNulo);
        Votante votante5 = new Votante("Mariana",38456789, new Voto(candidato2, LocalDate.now()));
        Votante votante6 = new Votante("Pedro",12345678, new Voto(candidato2, LocalDate.now()));
        Votante votante7 = new Votante("Benjamin",43909018, new Voto(candidato1, LocalDate.now()));
        Votante votante8 = new Votante("Jeremias",43810456, new Voto(candidato1, LocalDate.now()));
        Votante votante9 = new Votante("Monica",36789456,new Voto(candidato1, LocalDate.now()));
        Votante votante10 = new Votante("Diego",35456789, votoNulo);
        Votante votante11 = new Votante("YSYAAA", 1111111, new Voto(candidato2, LocalDate.now()));
        Votante votante22 = new Votante("BHAVI BOY", 222222, new Voto(candidato2, LocalDate.now()));



        //creo los elementosElectorales

        //mesas
        //creo las mesas con sus respectivos padrones
        Mesa mesa1 = new Mesa();
        mesa1.addPadron(votante1);
        mesa1.addPadron(votante2);
        mesa1.addPadron(votante3);
        mesa1.addPadron(votante11);

        Mesa mesa2 = new Mesa();
        mesa2.addPadron(votante4);
        mesa2.addPadron(votante5);
        mesa2.addPadron(votante6);

        Mesa mesa3 = new Mesa();
        mesa3.addPadron(votante7);
        mesa3.addPadron(votante8);
        mesa3.addPadron(votante9);
        mesa3.addPadron(votante10);

        mesa1.addVoto(votante1);
        mesa1.addVoto(votante2);
        mesa1.addVoto(votante3);

        mesa2.addVoto(votante4);
        mesa2.addVoto(votante5);
        mesa2.addVoto(votante6);

        mesa3.addVoto(votante7);
        mesa3.addVoto(votante8);
        mesa3.addVoto(votante9);
        mesa3.addVoto(votante10);

        Mesa mesa1111 = new Mesa();
        mesa1111.addPadron(votante11);
        mesa1111.addVoto(votante11);
        mesa1111.addPadron(votante22);
        mesa1111.addVoto(votante22);




        //lugares votables
        LugarVotable tandil = new LugarVotable();

        LugarVotable barrioDique = new LugarVotable();
        LugarVotable barrioSerrito = new LugarVotable();
        LugarVotable barrioMovediza = new LugarVotable();
        LugarVotable barrioTrap = new LugarVotable();

        //barrioDique
        LugarVotable escuelaGary = new LugarVotable();
        escuelaGary.addElementoElectoral(mesa1);
        barrioDique.addElementoElectoral(escuelaGary);

        //barrioSerrito
        LugarVotable escuelaSanIgnacio = new LugarVotable();
        escuelaSanIgnacio.addElementoElectoral(mesa2);
        barrioSerrito.addElementoElectoral(escuelaSanIgnacio);

        //barrioMovediza
        LugarVotable escuelaArcoiris = new LugarVotable();
        escuelaArcoiris.addElementoElectoral(mesa3);
        barrioMovediza.addElementoElectoral(escuelaArcoiris);

        //barrioTrap
        barrioTrap.addElementoElectoral(mesa1111);

        tandil.addElementoElectoral(barrioDique);
        tandil.addElementoElectoral(barrioSerrito);
        tandil.addElementoElectoral(barrioMovediza);
        tandil.addElementoElectoral(barrioTrap);



        System.out.println("cantidad total de votos:");
        System.out.println(tandil.getCantidadVotos());

        System.out.println(candidato1.getNombre() + ":");
        System.out.println(tandil.getPorcentajeVotosCandidato(candidato1) + "%");
        System.out.println(candidato2.getNombre() +":");
        System.out.println(tandil.getPorcentajeVotosCandidato(candidato2)+ "%");
        System.out.println(candidato3.getNombre() + ":");
        System.out.println(tandil.getPorcentajeVotosCandidato(candidato3)+ "%");

        System.out.println("votos nulos: " + tandil.getPorcentajeVotosEnBlanco());

    }
}
