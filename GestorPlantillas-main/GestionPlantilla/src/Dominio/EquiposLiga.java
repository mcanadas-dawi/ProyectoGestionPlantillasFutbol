package Dominio;

public enum EquiposLiga implements Equipos {
    RealMadrid,
    Barcelona,
    Atletico,
    Mallorca,
    Athletic,
    Girona,
    Alaves,
    Almeria,
    Betis,
    Cadiz,
    Celta,
    Getafe,
    Granada,
    LasPalmas,
    Osasuna,
    RayoVallecano,
    RealSociedad,
    Valencia,
    Sevilla,
    Villareal;
    public String mostrar() {
        return "Equipos participantes en la Liga: " +EquiposLiga.Atletico+
                ", " +EquiposLiga.Alaves+
                ", " +EquiposLiga.Athletic+
                ", " +EquiposLiga.Almeria+
                ", " +EquiposLiga.Barcelona+
                ", " +EquiposLiga.Betis+
                ", " +EquiposLiga.Cadiz+
                ", " +EquiposLiga.Celta+
                ", " +EquiposLiga.Getafe+
                ", " +EquiposLiga.Girona+
                ", " +EquiposLiga.Granada+
                ", " +EquiposLiga.LasPalmas+
                ", " +EquiposLiga.Mallorca+
                ", " +EquiposLiga.Osasuna+
                ", " +EquiposLiga.RayoVallecano+
                ", " +EquiposLiga.RealMadrid+
                ", " +EquiposLiga.RealSociedad+
                ", " +EquiposLiga.Sevilla+
                ", " +EquiposLiga.Valencia+
                ", " +EquiposLiga.Villareal;
    }
}
