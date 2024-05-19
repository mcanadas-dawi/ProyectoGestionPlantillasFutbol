package Dominio;
//CLASE PARA FUTURAS INCORPORACIONES
 public class Fichaje extends Persona {
    protected Posiciones posicion;
    public Fichaje(String nombre, String apellido, int edad, Posiciones posicion) {
         super(nombre, apellido, edad);
         this.posicion = posicion;

     }

    public String getEstado() {
         return "Fichado próxima temporada";
     }
     public String toString() {
      return "{ Nombre= "  +nombre +
              ", apellido= " + apellido +
              ", edad= "  + edad +
              ", posicion= " + posicion;
     }

 }
