package cena;

public class Pedido {

    private PrimerPlato primerPlato;
    private SegundoPlato segundoPlato;
    private Bebida bebida;
    private Postre postre;


    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreBebida, float precioBebida) {

        this.primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        this.bebida = new Bebida (nombreBebida, precioBebida);
    }

    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreSegundoPlato, float precioSegundoPlato, String nombreBebida, float precioBebida) {

        this.primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        this.segundoPlato = new SegundoPlato(nombreSegundoPlato, precioSegundoPlato);
        this.bebida = new Bebida (nombreBebida, precioBebida);
    }

    public Pedido (String nombrePrimerPlato, float precioPrimerPlato, String nombreSegundoPlato, float precioSegundoPlato, String nombreBebida, float precioBebida, String nombrePostre, float precioPostre) {

        this.primerPlato = new PrimerPlato(nombrePrimerPlato, precioPrimerPlato);
        this.segundoPlato = new SegundoPlato(nombreSegundoPlato, precioSegundoPlato);
        this.bebida = new Bebida (nombreBebida, precioBebida);
        this.postre = new Postre (nombrePostre, precioPostre);
    }

    public void getPedido() {
        if (primerPlato != null) {
        System.out.println("El primer plato es " + primerPlato.getNombre() + " y cuesta " + primerPlato.getPrecio());}
        if (segundoPlato != null) {
        System.out.println("El segundo plato es " + segundoPlato.getNombre()  + " y cuesta " + segundoPlato.getPrecio());}
        if (bebida != null) {
        System.out.println("La bebida es " + bebida.getNombre()  + " y cuesta " + bebida.getPrecio());}
        if (postre != null) {
        System.out.println("El postre es " + postre.getNombre() + " y cuesta " + postre.getPrecio());}
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
