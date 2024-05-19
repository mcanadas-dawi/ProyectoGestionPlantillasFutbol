package Dominio;

public class Entrenador extends Persona {
protected final String nacionalidad;
protected final TiposEntrenador tipoentrenador;

public Entrenador(String nombre, String apellido, int edad, String nacionalidad, TiposEntrenador tipoentrenador) {
    super(nombre,apellido,edad);
    this.nacionalidad = nacionalidad;
    this.tipoentrenador = tipoentrenador;
}
    public String getNacionalidad() {
    return this.nacionalidad;
    }

    public TiposEntrenador getTipoEntrenador() {
    return this.tipoentrenador;
    }

    @Override
    public String toString() {
        return "{  nombre= " + nombre +
                ", apellido= " + apellido +
                ", edad= " + edad +
                ", nacionalidad= " + nacionalidad +
                ", puesto= " + tipoentrenador +
                " }";
    }
}

