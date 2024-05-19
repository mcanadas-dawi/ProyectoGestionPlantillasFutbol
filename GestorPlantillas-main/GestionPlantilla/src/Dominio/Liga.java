package Dominio;

import java.util.ArrayList;
import java.util.List;
public class Liga extends Competicion {
private int puntos = 0;


    public Liga() {
        jornadas = 38;
        competicion = Competiciones.Liga;
        partidos = new ArrayList<>();
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void ComprobarCalendario() {
        try {
            if (partidos.size() == jornadas) {
                System.out.println("El calendario es correcto");
            } else {
                if (partidos.size() < jornadas) {
                    System.out.println("Faltan jornadas!");
                } else {
                    throw new CalendarioExcepcion("Sobran jornadas!");
                }
            }
        } catch (CalendarioExcepcion e) {
            throw new IndexOutOfBoundsException(e.getMessage());

        } finally {
            System.out.println("Recuerda que la liga tiene 38 jornadas");
        }
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
}

class CalendarioExcepcion extends Exception {
    public CalendarioExcepcion(String mensaje) {
        super(mensaje);
    }
}


