package Dominio;
//CLASE JUGADOR PARA DEFINIR EL OBJETO Y SUS ATRIBUTOS
public class Jugador extends Persona {
    protected Posiciones posicion;
    private boolean disponibleliga = true;
    private boolean disponiblecopa = true;
    private boolean disponiblechampions = true;
    private final int dorsal;
    private static int contadorJugadores = 0;

    public Jugador(String nombre, String apellido, int edad, Posiciones posicion, int dorsal) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        contadorJugadores ++;
    }

    public boolean getDisponibleLiga() {
        return disponibleliga;
    }
    public boolean getDisponibleCopa() {
        return disponiblecopa;
    }
    public boolean getDisponibleChampions() {
        return disponiblechampions;
    }
    public void alta() {
        disponibleliga=true;
        disponiblecopa=true;
        disponiblechampions=true;
    }
    public void altaLiga(){
        disponibleliga=true;
    }
    public void altaCopa(){
        disponiblecopa=true;
    }
    public void altaChampions(){
        disponiblechampions=true;
    }

    public void lesionado(){
        disponibleliga=false;
        disponiblecopa=false;
        disponiblechampions=false;
    }
    public void sancionado(Competiciones competicion){
        if (competicion == Competiciones.Liga) {
            disponibleliga=false;
        } else if (competicion == Competiciones.CopadelRey) {
            disponiblecopa=false;
        } else {
            disponiblechampions=false;
        }
    }


    public static int getContadorJugadores() {
        return contadorJugadores;
    }

    public void setPosicion(Posiciones nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    @Override
    public String toString() {
        return "{ disponible liga =" + disponibleliga +
                ", disponiblecopa =" + disponiblecopa +
                ", disponiblechampions =" + disponiblechampions +
                ", nombre= " + nombre +
                ", apellido= " + apellido +
                ", edad= " + edad +
                ", posicion= " + posicion +
                ", dorsal= " + dorsal +
                " }" ;
    }
}



