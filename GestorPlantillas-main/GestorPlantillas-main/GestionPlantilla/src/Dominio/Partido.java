package Dominio;

public class Partido {
    protected Equipos local;
    protected Equipos visitante;
    protected String fecha;
    public Partido(){}
    public Partido(Equipos local, Equipos visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
    }

    public String toString() {
        return "{ Local= " + local +
                ", visitante = " + visitante +
                ", fecha= " + fecha +
                " }";
    }
}
