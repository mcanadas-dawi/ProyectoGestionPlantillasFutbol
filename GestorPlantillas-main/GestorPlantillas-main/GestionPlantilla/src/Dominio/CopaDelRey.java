package Dominio;

import java.util.ArrayList;
import java.util.List;

public class CopaDelRey extends Competicion {
    private boolean eliminado = false;
    private List<Plantilla> plantillas;
    public CopaDelRey () {
        jornadas = 6;
        competicion = Competiciones.CopadelRey;
        partidos = new ArrayList<>();
    }
    public void agregarPartido(Partido partido) {
        if (!eliminado) {
        partidos.add(partido);
    } else {
            throw new IllegalArgumentException("El equipo ha sido eliminado de la Copa , no se pueden agregar partidos");
        }
        }

    public List<Partido> getPartidos() {
        return partidos;
    }
    public void Eliminados() {
        eliminado = true;
    }
}
