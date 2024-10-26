package cena;

public class Postre {
    public static String nombre = "";
    public static  float precio = 0;

    public Postre (String nombre, float precio) {
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