package practico9_ej1;

import practico9_ej1.comparadores.ComparadorXApellidoYnombre;
import practico9_ej1.comparadores.ComparadorXCancha;
import practico9_ej1.comparadores.ComparadorXEdad;
import practico9_ej1.condiciones.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //creo el club
        Club nahuel = new Club();
        //creo los socios
        Socio socio1 = new Socio("PerezJuan",  17,false);
        Socio socio2 = new Socio("PerezAntonio",  16,false);
        Socio socio3 = new Socio("Marcos",  28,true);
        Socio socio4 = new Socio("guille",  20,true);

        //creo los turnos
        Turno turno1 = new Turno(LocalDate.of(2023,10,17),1, 550);
        Turno turno2 = new Turno(LocalDate.of(2023,11,11),2, 400);

        //añado los turnos a los socios
        socio1.addTurno(turno1);
        socio1.addTurno(turno1);
        socio2.addTurno(turno1);
        socio3.addTurno(turno2);
        socio4.addTurno(turno1);
        socio4.addTurno(turno1);
        socio4.addTurno(turno1);

        //añado los socios al club
        nahuel.addSocio(socio1);
        nahuel.addSocio(socio2);
        nahuel.addSocio(socio3);
        nahuel.addSocio(socio4);

        //condiciones
        Condicion con1 = new CondicionXCuota();
        Condicion con2 = new CondicionXEdad(18);
        Condicion con3 = new CondicionXCancha(1);
        Condicion con4 = new CondicionXPago(500);


        //ordenadores
        Comparator<Socio> ordenarXApelidoYNombre = new ComparadorXApellidoYnombre();
        Comparator<Socio> ordenarXEdad = new ComparadorXEdad();
        Comparator<Socio> ordenXCancha = new ComparadorXCancha(1);

        //Metodos esperados
        System.out.println("Socios ordenados por cuota impaga y por apellidoYnombre");
        System.out.println(nahuel.buscar(new CondicionNOT(con1), ordenarXApelidoYNombre));

        System.out.println("Socios ordenados por minoria de edad y edad ");
        System.out.println(nahuel.buscar(con2, ordenarXEdad));

        System.out.println("Socios ordenados por id de cancha y por cant de veces que alquilaron dicha cancha");
        System.out.println(nahuel.buscar(con3, ordenXCancha.reversed()));

        System.out.println("Socios ordenados por pago");
        ArrayList<Socio> aux = nahuel.buscar(con4, ordenarXApelidoYNombre);
        System.out.println(nahuel.buscar(con4, ordenarXApelidoYNombre));

    }
}
