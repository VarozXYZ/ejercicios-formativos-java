package cena;

public class Pedido {

    private PrimerPlato primerPlato;
    private SegundoPlato segundoPlato;
    private Bebida bebida;
    private Postre postre;


    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreBebida, float precioBebida) {

        PrimerPlato primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        Bebida bebida = new Bebida (nombreBebida, precioBebida);
    }

    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreSegundoPlato, float precioSegundoPlato, String nombreBebida, float precioBebida) {

        PrimerPlato primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        SegundoPlato segundoPlato = new SegundoPlato(nombreSegundoPlato, precioSegundoPlato);
        Bebida bebida = new Bebida (nombreBebida, precioBebida);
    }

    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreSegundoPlato, float precioSegundoPlato, String nombreBebida, float precioBebida, String nombrePostre, float precioPostre) {

        PrimerPlato primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        SegundoPlato segundoPlato = new SegundoPlato(nombreSegundoPlato, precioSegundoPlato);
        Bebida bebida = new Bebida (nombreBebida, precioBebida);
        Postre postre = new Postre (nombrePostre, precioPostre);
    }

    public void getPedido() {
        if (PrimerPlato.nombre != "") {
        System.out.println("El primer plato es " + PrimerPlato.nombre + " y cuesta " + PrimerPlato.precio);}
        if (SegundoPlato.nombre != "") {
        System.out.println("El segundo plato es " + SegundoPlato.nombre  + " y cuesta " + SegundoPlato.precio);}
        if (Bebida.nombre != "") {
        System.out.println("La bebida es " + Bebida.nombre  + " y cuesta " + Bebida.precio);}
        if (Postre.nombre != "") {
        System.out.println("El postre es " + Postre.nombre + " y cuesta " + Postre.precio);}
    }

    public static void main (String[] args) {
        
        Pedido pedido1 = new Pedido ("Ensalada", 5, "Nestea", 2.5f);
        pedido1.getPedido();
        System.out.println("\n");
        Pedido pedido2 = new Pedido ("Tortilla patatas", 9, "Secreto iberico", 18, "Cerveza", 2);
        pedido2.getPedido();
        System.out.println("\n");
        Pedido pedido3 = new Pedido ("Salmorejo", 5, "Pez espada", 20, "Cerveza", 2, "Mouse de chocolate", 7);
        pedido3.getPedido();
    }
}
