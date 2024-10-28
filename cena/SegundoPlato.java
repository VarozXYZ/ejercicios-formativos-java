package cena;

public class SegundoPlato {
    private String nombre = "";
    private float precio = 0;

    
    public SegundoPlato (String nombre, float precio) {
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
