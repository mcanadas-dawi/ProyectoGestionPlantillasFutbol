package Dominio;
import java.util.ArrayList;
import java.util.List;
//CLASE PARA ALMACENAR LOS JUGADORES DE LA PLANTILLA
public class Plantilla {
    private final List<Jugador> jugadores;
    private static final int jugadoresMaximos = 16;


    public Plantilla() {
        jugadores = new ArrayList<>();

    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public int size() {
        return jugadores.size();
    }
    //COMPROBADOR DE PLANTILLA CORRECTA
    public void ComprobarPlantilla() {
        try {
            if (jugadores.size() <= jugadoresMaximos) {
              System.out.println("La plantilla es correcta");
            } else {
                throw new PlantillaExcepcion("Sobran jugadores");
                }

        } catch (PlantillaExcepcion e) {
            throw new IndexOutOfBoundsException (e.getMessage());
        } finally {
            System.out.println("Recuerda que el numero máximo de jugadores en plantilla debe ser 16");
        }
    }
    // JUGADORES DISPONIBLES LIGA
    public  String[] getJugadoresDisponiblesLiga() {
        List<String> ListaDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getDisponibleLiga()) {
                ListaDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] DisponiblesArray = new String[ListaDisponibles.size()];
        ListaDisponibles.toArray(DisponiblesArray);

        return DisponiblesArray;
    }
    //JUGADORES NO DISPONIBLES LIGA
    public  String[] getJugadoresNoDisponiblesLiga() {
        List<String> ListaNoDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (!jugador.getDisponibleLiga()) {
                ListaNoDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] NoDisponiblesArray = new String[ListaNoDisponibles.size()];
        ListaNoDisponibles.toArray(NoDisponiblesArray);

        return NoDisponiblesArray;
    }
    // JUGADORES DISPONIBLES COPA
    public  String[] getJugadoresDisponiblesCopa() {
        List<String> ListaDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getDisponibleCopa()) {
                ListaDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] DisponiblesArray = new String[ListaDisponibles.size()];
        ListaDisponibles.toArray(DisponiblesArray);

        return DisponiblesArray;
    }
    //JUGADORES NO DISPONIBLES COPA
    public  String[] getJugadoresNoDisponiblesCopa() {
        List<String> ListaNoDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (!jugador.getDisponibleCopa()) {
                ListaNoDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] NoDisponiblesArray = new String[ListaNoDisponibles.size()];
        ListaNoDisponibles.toArray(NoDisponiblesArray);

        return NoDisponiblesArray;
    }
    // JUGADORES DISPONIBLES
    public  String[] getJugadoresDisponiblesChampions() {
        List<String> ListaDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (jugador.getDisponibleChampions()) {
                ListaDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] DisponiblesArray = new String[ListaDisponibles.size()];
        ListaDisponibles.toArray(DisponiblesArray);

        return DisponiblesArray;
    }
    //JUGADORES NO DISPONIBLES
    public  String[] getJugadoresNoDisponiblesChampions() {
        List<String> ListaNoDisponibles = new ArrayList<>();

        for (Jugador jugador : jugadores) {
            if (!jugador.getDisponibleChampions()) {
                ListaNoDisponibles.add(jugador.getNombre() + " " + jugador.getApellido());
            }
        }

        String[] NoDisponiblesArray = new String[ListaNoDisponibles.size()];
        ListaNoDisponibles.toArray(NoDisponiblesArray);

        return NoDisponiblesArray;
    }

}
//CLASE PARA EL ERROR
class PlantillaExcepcion extends Exception {
    public PlantillaExcepcion(String mensaje) {
        super(mensaje);
    }
}


