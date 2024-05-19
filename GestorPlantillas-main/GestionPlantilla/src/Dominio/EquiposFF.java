package Dominio;

public enum EquiposFF implements Equipos {
    RealMadrid,
    BorussiaDormund,
    BayernMunich,
    PSG,
    ManchesterCity,
    Arsenal,
    Atletico,
    Barcelona,
    Copenhague,
    Leipzig,
    Lazio,
    RealSociedad,
    InterMilan,
    Oporto,
    Napoles,
    PSV;
    public String mostrar() {
        return "Equipos participantes en la fase final de la Champions: " + EquiposFF.Arsenal +
                ", " + EquiposFF.Atletico +
                ", " + EquiposFF.Barcelona +
                ", " + EquiposFF.BayernMunich +
                ", " + EquiposFF.BorussiaDormund +
                ", " + EquiposFF.Copenhague +
                ", " + EquiposFF.InterMilan +
                ", " + EquiposFF.Lazio +
                ", " + EquiposFF.Leipzig +
                ", " + EquiposFF.ManchesterCity +
                ", " + EquiposFF.Napoles +
                ", " + EquiposFF.Oporto +
                ", " + EquiposFF.PSG +
                ", " + EquiposFF.PSV +
                ", " + EquiposFF.RealMadrid +
                ", " + EquiposFF.RealSociedad;
    }
}
