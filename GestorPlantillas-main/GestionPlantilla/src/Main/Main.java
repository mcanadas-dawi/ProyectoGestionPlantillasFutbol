package Main;

import Dominio.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // INICIALIZAMOS TODOS LOS JUGADORES DE LA PLANTILLA
        Jugador Marc = new Jugador("Marc","Cañadas",30,Posiciones.Centrocampista,11);
        Jugador Courtois = new Jugador("Thibaut", "Courtois", 30, Posiciones.Portero, 1);
        Jugador Lunnin = new Jugador ("Andrey","Lunnin",20,Posiciones.Portero,13);
        Jugador Carvajal = new Jugador("Dani", "Carvajal", 30, Posiciones.Defensa, 2);
        Jugador Rudiger = new Jugador("Antonio", "Rudiger", 24, Posiciones.Defensa, 3);
        Jugador Alaba = new Jugador("David", "Alaba", 30, Posiciones.Defensa, 4);
        Jugador Mendy = new Jugador("Ferland", "Mendy", 27, Posiciones.Defensa, 23);
        Jugador Valverde = new Jugador("Fede","Valverde",25,Posiciones.Centrocampista,15);
        Jugador Tchouameni = new Jugador("Aurelien", "Tchouameni", 22, Posiciones.Centrocampista, 18);
        Jugador Modric = new Jugador ("Luka","Modric",36,Posiciones.Centrocampista,10);
        Jugador Kroos = new Jugador("Toni", "Kroos", 34, Posiciones.Centrocampista, 8);
        Jugador Camavinga= new Jugador("Eduardo", "Camavinga", 22, Posiciones.Centrocampista, 12);
        Jugador Bellingham = new Jugador("Jude", "Bellingham", 20, Posiciones.Centrocampista, 5);
        Jugador Vinicius = new Jugador("Vinicius", "Junior", 22, Posiciones.Delantero, 7);
        Jugador Rodrygo= new Jugador("Rodrygo", "Goes", 23, Posiciones.Delantero, 6);
        Jugador Joselu = new Jugador("Joselu", "Mato", 29, Posiciones.Centrocampista, 17);
        //JUGADOR EXTRA PARA COMPROBAR EL CORRECTO FUNCIONAMIENTO DE TRY CATCH
        // Jugador Nacho = new Jugador ("Nacho","Fernandez",31,Posiciones.Defensa,24);
        Joselu.setPosicion(Posiciones.Delantero);
        System.out.println("Hay " +Jugador.getContadorJugadores()+ " jugadores");

        // INICIALIZAMOS AL CUERPO TECNICO

        Entrenador Ancelotti = new Entrenador("Carlo","Ancelotti",50,"Italiano", TiposEntrenador.PrimerEntrenador);
        Entrenador Pintus = new Entrenador("Antonio","Pintus",60,"Italiano", TiposEntrenador.PreparadorFisico);
        System.out.println(Ancelotti);
        System.out.println("De donde es Pintus? " + Pintus.getNacionalidad());

        // CREAMOS LA PLANTILLA Y AÑADIMOS A TODOS LOS JUGADORES, MAX 16
        Plantilla PlantillaRM = new Plantilla();
        PlantillaRM.agregarJugador(Marc);
        PlantillaRM.agregarJugador(Courtois);
        PlantillaRM.agregarJugador(Lunnin);
        PlantillaRM.agregarJugador(Carvajal);
        PlantillaRM.agregarJugador(Rudiger);
        PlantillaRM.agregarJugador(Alaba);
        PlantillaRM.agregarJugador(Mendy);
        PlantillaRM.agregarJugador(Valverde);
        PlantillaRM.agregarJugador(Tchouameni);
        PlantillaRM.agregarJugador(Modric);
        PlantillaRM.agregarJugador(Kroos);
        PlantillaRM.agregarJugador(Camavinga);
        PlantillaRM.agregarJugador(Bellingham);
        PlantillaRM.agregarJugador(Vinicius);
        PlantillaRM.agregarJugador(Rodrygo);
        PlantillaRM.agregarJugador(Joselu);
        //PlantillaRM.agregarJugador(Nacho);
        PlantillaRM.ComprobarPlantilla(); // COMPROBADOR DE PLANTILLA
        System.out.println("La plantilla consta de " + PlantillaRM.size()+ " jugadores");

        //JUGADORES DISPONIBLES ACTUALMENTE
        Alaba.lesionado();

        System.out.println("Jugadores disponibles para el próximo partido de Liga : "+Arrays.toString(PlantillaRM.getJugadoresDisponiblesLiga()));
        System.out.println("Bajas para el próximo partido de Liga: " +Arrays.toString(PlantillaRM.getJugadoresNoDisponiblesLiga()));

        // INICIALIZO LAS ESTADISTICAS
        Estadisticas statsCarvajal = new Estadisticas (Carvajal);
        Estadisticas statsMarc = new Estadisticas (Marc);
        Estadisticas statsVinicius = new Estadisticas (Vinicius);

        //JORNADAS DE LA LIGA
        Partido jornada1 = new Partido(EquiposLiga.RealMadrid,EquiposLiga.Barcelona,"1/12/2024");
        Partido jornada2 = new Partido(EquiposLiga.Atletico,EquiposLiga.RealMadrid,"8/12/2024");
        Partido jornada3 = new Partido(EquiposLiga.RealMadrid,EquiposLiga.Mallorca,"15/12/2024");
        Partido jornada4 = new Partido(EquiposLiga.Girona,EquiposLiga.RealMadrid,"10/1/2025");
        Partido jornada5 = new Partido(EquiposLiga.RealMadrid,EquiposLiga.Athletic,"17/1/2025");
       //Partido jornada6 = new Partido(Equipos.RealMadrid,Equipos.Athletic,"24/1/2025"); //JORNADA PARA COMPROBAR TRY CATCH
        Liga LigaEA = new Liga();
        //PRESENTAMOS A LOS EQUIPOS PARTICIPANTES EN LA LIGA
        EquiposLiga equiposLiga = EquiposLiga.RealMadrid;
        System.out.println(equiposLiga.mostrar());
        LigaEA.agregarPartido(jornada1);

        // JORNADA 1
        statsCarvajal.amonestarLiga();
        statsMarc.asistirLiga();
        statsVinicius.marcarLiga();
        statsVinicius.marcarLiga();
        LigaEA.Victoria();
        LigaEA.agregarPartido(jornada2);
        // JORNADA 2
        statsCarvajal.amonestarLiga();
        statsMarc.expulsarLiga();
        LigaEA.Empate();
        LigaEA.agregarPartido(jornada3);
        System.out.println("Esta Marc disponible despues de la tarjeta roja ?" +Marc.getDisponibleLiga());

        // JORNADA 3
        statsCarvajal.amonestarLiga();
        LigaEA.Victoria();
        // COMPROBAR SI PUEDO AÑADIR UN JUGADOR QUE NO ESTA DISPONIBLE
        // statsMarc.asistirLiga();
        LigaEA.agregarPartido(jornada4);
        Marc.alta();
        // JORNADA 4
        statsCarvajal.amonestarLiga();
        LigaEA.Victoria();
        LigaEA.agregarPartido(jornada5);
        // JORNADA 5
        statsCarvajal.amonestarLiga();
        LigaEA.ComprobarCalendario();
        System.out.println("Puntos en la Liga: " +LigaEA.getPuntos());
        System.out.println("Partidos de la Liga:" +LigaEA.getPartidos());
        // COMPROBAMOS SI CARVAJAL PUEDE JUGAR LA SIGUIENTE JORNADA ( TIENE 5 AMARILLAS)
        System.out.println("Esta Carvajal disponible para la proxima jornada? " +Carvajal.getDisponibleLiga());
        System.out.println(Vinicius);
        System.out.println("Jornada 1: "+ jornada1);
        // JORNADA 6 (CARVAJAL CUMPLE SANCION)
        // JORNADA 7 CARVAJAL DISPONIBLE
        Carvajal.altaLiga();

        // COPA DE REY
        CopaDelRey Copa = new CopaDelRey();
        //PRESENTAMOS A LOS EQUIPOS PARTICIPANTES EN LA COPA DE REY
        EquiposCopa equiposCopa = EquiposCopa.RealMadrid;
        System.out.println(equiposCopa.mostrar());
        Partido Dieciseisavos = new Partido (EquiposCopa.Arandina,EquiposCopa.RealMadrid,"6/01/2024");
        System.out.println("Jugadores disponibles para el próximo partido de Copa : "+Arrays.toString(PlantillaRM.getJugadoresDisponiblesCopa()));
        System.out.println("Bajas para el próximo partido de Copa: " +Arrays.toString(PlantillaRM.getJugadoresNoDisponiblesCopa()));
        Copa.agregarPartido(Dieciseisavos);
        statsVinicius.marcarCopa();
        statsMarc.asistirCopa();
        statsCarvajal.expulsarCopa();
        statsVinicius.amonestarCopa();
        System.out.println("Jugadores disponibles para el próximo partido de Copa : "+Arrays.toString(PlantillaRM.getJugadoresDisponiblesCopa()));
        System.out.println("Bajas para el próximo partido de Copa: " +Arrays.toString(PlantillaRM.getJugadoresNoDisponiblesCopa()));
        Partido Octavos = new Partido (EquiposCopa.Atletico,EquiposCopa.RealMadrid,"18/01/2024");
        Copa.agregarPartido(Octavos);
        Copa.Eliminados();
       // Partido Cuartos = new Partido();
         // COMPROBAMOS QUE NO PODEMOS AGREGAR PARTIDOS SI ESTAMOS ELIMINADOS
        // Copa.agregarPartido(Cuartos);

        // CHAMPIONS
        //FASE DE GRUPOS
        ChampionsF1 Champions = new ChampionsF1();
        //PRESENTAMOS A LOS EQUIPOS PARTICIPANTES EN LA FASE DE GRUPOS GRUPO C
        EquiposFG equiposFG = EquiposFG.RealMadrid;
        System.out.println(equiposFG.mostrar());
        Partido jornadaC1 = new Partido (EquiposFG.RealMadrid,EquiposFG.UnionBerlin,"");
        Valverde.Cumple();
        Partido jornadaC2 = new Partido (EquiposFG.Napoles,EquiposFG.RealMadrid,"");
        Partido jornadaC3 = new Partido (EquiposFG.RealMadrid,EquiposFG.Braga,"");
        Partido jornadaC4 = new Partido (EquiposFG.UnionBerlin,EquiposFG.RealMadrid,"");
        Partido jornadaC5 = new Partido (EquiposFG.RealMadrid,EquiposFG.Napoles,"");
        Partido jornadaC6 = new Partido (EquiposFG.Braga,EquiposFG.RealMadrid,"");
        Champions.agregarPartido(jornadaC1);
        statsCarvajal.amonestarChampions();
        statsVinicius.marcarChampions();
        Champions.Victoria();
        Champions.agregarPartido(jornadaC2);
        statsCarvajal.amonestarChampions();
        statsVinicius.expulsarChampions();
        Champions.Victoria();
        Champions.agregarPartido(jornadaC3);
        statsCarvajal.amonestarChampions();
        statsMarc.marcarChampions();
        Champions.Victoria();
        Champions.agregarPartido(jornadaC4); // COMPROBAMOS SI CARVAJAL PODRIA JUGAR ( TIENE 3 AMARILLAS, NO DEBERIA)
        Vinicius.altaChampions();
        System.out.println("Jugadores disponibles para el próximo partido de Champions : "+Arrays.toString(PlantillaRM.getJugadoresDisponiblesChampions()));
        System.out.println("Bajas para el próximo partido de Champions: " +Arrays.toString(PlantillaRM.getJugadoresNoDisponiblesChampions()));
        Champions.Victoria();
        Champions.agregarPartido(jornadaC5);
        statsMarc.asistirChampions();
        Champions.Victoria();
        Champions.agregarPartido(jornadaC6); // VUELVE CARVAJAL
        Carvajal.altaChampions();
        statsVinicius.marcarChampions();
        statsCarvajal.amonestarChampions();
        Champions.Victoria();
        System.out.println("El Real Madrid ha conseguido " +Champions.getPuntos()+ " puntos al finalizar la fase de grupos");
        // FASE FINAL
        ChampionsF1.Clasificado(); // SI NO CONFIRMAMOS LA CLASIFICACION NO PODREMOS INSTANCIAR LA CLASE CHAMPIONSF2
        ChampionsF2 ChampionsFF = new ChampionsF2();
        //PRESENTAMOS A LOS EQUIPOS PARTICIPANTES EN LA FASE FINAL DE LA CHAMPIONS
        EquiposFF equiposFF = EquiposFF.RealMadrid;
        System.out.println(equiposFF.mostrar());
        Partido octavos1 = new Partido (EquiposFF.Leipzig,EquiposFF.RealMadrid,"");
        statsMarc.asistirChampions();
        Partido octavos2 = new Partido (EquiposFF.RealMadrid,EquiposFF.Leipzig,"");
        Partido cuartos1 = new Partido (EquiposFF.RealMadrid,EquiposFF.ManchesterCity,"");
        Partido cuartos2 = new Partido (EquiposFF.ManchesterCity,EquiposFF.RealMadrid,"");
        Partido semis1 = new Partido (EquiposFF.BayernMunich,EquiposFF.RealMadrid,"");
        statsVinicius.marcarChampions();
        statsVinicius.marcarChampions();
        statsMarc.asistirChampions();
        Partido semis2 = new Partido (EquiposFF.RealMadrid,EquiposFF.BayernMunich,"");
        Partido finalch = new Partido (EquiposFF.RealMadrid,EquiposFF.BorussiaDormund,"");
        ChampionsFF.agregarPartido(octavos1);
        ChampionsFF.agregarPartido(octavos2);
        statsCarvajal.amonestarChampions();
        ChampionsFF.agregarPartido(cuartos1); // COMPROBAMOS SI CARVAJAL PUEDE JUGAR ( TIENE 5 AMARILLAS, NO DEBERIA)
        //statsCarvajal.amonestarChampions();
        ChampionsFF.agregarPartido(cuartos2);
        ChampionsFF.agregarPartido(semis1); // SE LIMPIAN TARJETAS, TODOS DISPONIBLES SALVO LESION
        Carvajal.altaChampions();
        ChampionsFF.agregarPartido(semis2);
        ChampionsFF.agregarPartido(finalch);
        ChampionsFF.Campeones();
        System.out.println(ChampionsFF.getPartidos());
        //FICHAJES PROXIMA TEMPORADA
        Fichaje Pere = new Fichaje("Pere","Bonet",30,Posiciones.Defensa);
        System.out.println(Pere.getEstado());

        // ESTADISTICAS TOTALES
        System.out.println(statsCarvajal);
        System.out.println(statsMarc);
        System.out.println(statsVinicius);
    }
}
