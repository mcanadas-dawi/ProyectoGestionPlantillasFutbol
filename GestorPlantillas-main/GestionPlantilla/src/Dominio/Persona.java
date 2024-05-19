package Dominio;

public abstract class Persona {
    protected final String nombre;
    protected final String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void Cumple() {
        this.edad++;
    }
    public abstract String toString();
}

