package cena;

public class Bebida {
    private String nombre = "";
    private float precio = 0;

    public Bebida (String nombre, float precio) {
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
