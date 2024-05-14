package Dominio;

import java.util.ArrayList;

public class ChampionsF1 extends Competicion {
private int puntos = 0;
private static boolean Clasificado = false;
    public ChampionsF1() {
        jornadas = 6;
        competicion = Competiciones.ChampionsF1;
        partidos = new ArrayList<>();
    }
    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void Victoria() {
        puntos += 3;
    }
    public void Empate() {
        puntos += 1;
    }
    public int getPuntos() {
        return puntos;
    }
    public static boolean Clasificados() {
        return Clasificado;
    }
    public static void Clasificado(){
        Clasificado = true;
    }
}

