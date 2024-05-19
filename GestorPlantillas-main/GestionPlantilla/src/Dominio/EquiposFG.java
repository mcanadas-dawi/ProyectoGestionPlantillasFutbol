package Dominio;

public enum EquiposFG implements Equipos {
 RealMadrid,
  Napoles,
  Braga,
  UnionBerlin;
 public String mostrar() {
  return "Equipos participantes grupo C de la Champions: " + EquiposFG.Braga +
          ", " +EquiposFG.Napoles+
          ", " +EquiposFG.RealMadrid+
          ", " +EquiposFG.UnionBerlin;
 }
}
