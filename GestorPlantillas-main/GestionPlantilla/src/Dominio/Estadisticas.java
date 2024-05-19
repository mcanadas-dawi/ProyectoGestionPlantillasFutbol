package Dominio;

public class Estadisticas {
    private final Jugador jugador;
    private int totalgoles = 0;
    private int totalasistencias = 0;
    private int totalamarillas = 0;
    private int totalrojas = 0;
    private int golesliga = 0;
    private int asistenciasliga = 0;
    private int amarillasliga = 0;
    private int rojasliga = 0;
    private int golescopa = 0;
    private int asistenciascopa = 0;
    private int amarillascopa = 0;
    private int rojascopa = 0;
    private int goleschampions = 0;
    private int asistenciaschampions = 0;
    private int amarillaschampions = 0;
    private int rojaschampions = 0;


    public Estadisticas(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getTotalGoles() {
        return totalgoles;
    }

    public int getTotalAsistencias() {
        return totalasistencias;
    }

    public int getTotalTarjetasAmarillas() {
        return totalamarillas;
    }

    public int getTotalTarjetasRojas() {
        return totalrojas;
    }

    public int getGolesliga() {
        return golesliga;
    }

    public int getGolescopa() {
        return golescopa;
    }

    public int getGoleschampions() {
        return goleschampions;
    }

    public int getAsistenciasliga() {
        return asistenciasliga;
    }

    public int getAsistenciascopa() {
        return asistenciascopa;
    }

    public int getAsistenciaschampions() {
        return asistenciaschampions;
    }

    public int getAmarillasliga() {
        return amarillasliga;
    }

    public int getAmarillascopa() {
        return amarillascopa;
    }

    public int getAmarillaschampions() {
        return amarillaschampions;
    }

    public int getRojasliga() {
        return rojasliga;
    }

    public int getRojascopa() {
        return rojascopa;
    }

    public int getRojaschampions() {
        return rojaschampions;
    }

    public void marcarLiga() {
        if (jugador.getDisponibleLiga()) {
            golesliga++;
            totalgoles++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Liga");
        }
    }

    public void marcarCopa() {
        if (jugador.getDisponibleCopa()) {
            golescopa++;
            totalgoles++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Copa");
        }
    }

    public void marcarChampions() {
        if (jugador.getDisponibleChampions()) {
            goleschampions++;
            totalgoles++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Champions");
        }
    }

    public void asistirLiga() {
        if (jugador.getDisponibleLiga()) {
            asistenciasliga++;
            totalasistencias++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Liga");
        }
    }

    public void asistirCopa() {
        if (jugador.getDisponibleCopa()) {
            asistenciascopa++;
            totalasistencias++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Copa");
        }
    }

    public void asistirChampions() {
        if (jugador.getDisponibleChampions()) {
            asistenciaschampions++;
            totalasistencias++;
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Champions");
        }
    }


    public void amonestarLiga() {
        if (jugador.getDisponibleLiga()) {
            amarillasliga++;
            totalamarillas++;
            if(amarillasliga % 5 ==0 ) {
                jugador.sancionado(Competiciones.Liga);
            }
            } else {
                throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Liga");
            }

        }
    public void amonestarCopa() {
        if (jugador.getDisponibleCopa()) {
            amarillascopa++;
            totalamarillas++;
            if(amarillascopa % 3 ==0 ) {
                jugador.sancionado(Competiciones.CopadelRey);
            }
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Copa");
        }

    }
    public void amonestarChampions() {
        if (jugador.getDisponibleChampions()) {
            amarillaschampions++;
            totalamarillas++;
            if(amarillaschampions == 3 || amarillaschampions == 5 ) {
                jugador.sancionado(Competiciones.ChampionsF1);
                jugador.sancionado(Competiciones.ChampionsF2);
            }
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Champions");
        }

    }
    public void expulsarLiga() {
        if (jugador.getDisponibleLiga()) {
            rojasliga++;
            totalrojas++;
            jugador.sancionado(Competiciones.Liga);
        } else {
            throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Liga");
        }
    }
        public void expulsarCopa() {
            if (jugador.getDisponibleCopa()) {
                rojascopa++;
                totalrojas++;
                jugador.sancionado(Competiciones.CopadelRey);
            } else {
                throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Copa");
            }
        }
            public void expulsarChampions() {
                if (jugador.getDisponibleChampions()) {
                    rojaschampions++;
                    totalrojas++;
                    jugador.sancionado(Competiciones.Champions);
                } else {
                    throw new IllegalArgumentException(jugador.getNombre() + " " + jugador.getApellido() + " no esta disponible para este partido de Champions");
                }

    }

    @Override
    public String toString() {
        return "{ " +jugador.getNombre()+ " " +jugador.getApellido()+
                " } Goles Liga: " +getGolesliga()+
                ", goles Copa: " +getGolescopa()+
                ", goles Champions: " +getGoleschampions()+
                ", asistencias Liga: " +getAsistenciasliga()+
                ", asistencias Copa: " +getAsistenciascopa()+
                ", asistencias Champions: " +getAsistenciaschampions()+
                ", tarjetas amarillas Liga: " +getAmarillasliga()+
                ", tarjetas amarillas Copa: " +getAmarillascopa()+
                ", tarjetas amarillas Champions: " +getAmarillaschampions()+
                ", tarjetas rojas Liga: " +getRojasliga()+
                ", tarjetas rojas Copa: " +getRojascopa()+
                ", tarjetas rojas Champions: " +getRojaschampions()+
                ", GOLES TOTALES: " +getTotalGoles()+
                ", ASISTENCIAS TOTALES: " +getTotalAsistencias()+
                ", TARJETAS AMARILLAS TOTALES: " +getTotalTarjetasAmarillas()+
                ", TARJETAS ROJAS TOTALES: " +getTotalTarjetasRojas();

    }
}
