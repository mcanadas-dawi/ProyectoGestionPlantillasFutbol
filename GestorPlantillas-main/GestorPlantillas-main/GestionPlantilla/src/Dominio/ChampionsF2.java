package Dominio;

import java.util.ArrayList;
import java.util.List;

public class ChampionsF2 extends Competicion {
    private boolean eliminado = false;
    public ChampionsF2 () {
        jornadas = 7;
        competicion = Competiciones.ChampionsF2;
        partidos = new ArrayList<>();
        if (!ChampionsF1.Clasificados()) {
            throw new IllegalArgumentException("No se ha clasificado en la fase de grupos y por lo tanto, no podrá participar en la fase final");
        }
    }
    public void agregarPartido(Partido partido) {
        if (!eliminado) {
            partidos.add(partido);
        } else {
            System.out.println("El equipo ha sido eliminado, no se pueden agregar partidos");
        }
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void Eliminados() {
        eliminado = true;
    }
    public void Campeones() {
        System.out.println("LA 15 !!! COMO NO TE VOY A QUERER? COMO NO TE VOY A QUERER? SI ERES CAMPEON DE EUROPA UNA Y OTRA VEZ!");
    }
}

