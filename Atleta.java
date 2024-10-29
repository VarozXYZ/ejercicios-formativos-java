public class Atleta {
	private int identificador;
	private String nombre;
	private double tiempo100;
	private static int counter = 0;
	private static String seleccion = "Francia";
	private static double tiempoEquipo;
	
	public Atleta(String nombre, double tiempo100) {
		counter++;
		identificador = counter;
		this.nombre = nombre;
		this.tiempo100 = tiempo100;
		tiempoEquipo+= tiempo100;
	}
	public void correr100(double tiempo) {
		tiempoEquipo-= tiempo100;
		tiempo100 = tiempo;
		tiempoEquipo+= tiempo100;
	}
	public void seleccion() {
		System.out.println(seleccion);
	}
	public static void tiempoTotal() {
		System.out.println("Suma del tiempo de todos los integrantes del equipo: " + tiempoEquipo + "segundos." );
	}
	
	public void infoAtleta() {
		System.out.println(this.nombre);
		System.out.println(this.tiempo100);
		System.out.println(this.identificador);
	}
	
	public static void main (String[] args) {
		Atleta atleta1 = new Atleta ("Usain Bolt", 9.58);
		Atleta atleta2 = new Atleta ("Elaine Thompson", 10.61);
		Atleta atleta3 = new Atleta ("Marcel Jacobs", 9.8);
		Atleta atleta4 = new Atleta ("Christine Arron", 10.73);
		
		atleta1.infoAtleta();
		atleta2.infoAtleta();
		atleta3.infoAtleta();
		atleta4.infoAtleta();
		tiempoTotal();
		
	}
}
