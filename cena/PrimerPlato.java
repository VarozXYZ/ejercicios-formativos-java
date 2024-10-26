package cena;

public class PrimerPlato {
    private String nombre = "";
    private float precio = 0;

    public PrimerPlato(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
}
