package furgoneta;

public class Furgoneta {
	private String marcaFurgoneta;
	private Motor motor;
	private Rueda rueda1;
	private Rueda rueda2;
	private Rueda rueda3;
	private Rueda rueda4;
	private Ventana ventana1;
	private Ventana ventana2;
	private Ventana ventana3;
	private Ventana ventana4;
	private Puerta puerta1;
	private Puerta puerta2;
	private Puerta puerta3;
	private Puerta puerta4;
	private Puerta puerta5;

	public Furgoneta(String marcaFurgoneta, int cilindrada, String marca, boolean tintada, boolean corredera) {
		this.marcaFurgoneta = marcaFurgoneta;
		this.motor = new Motor(cilindrada);
		this.rueda1 = new Rueda(marca);
		this.rueda2 = new Rueda(marca);
		this.rueda3 = new Rueda(marca);
		this.rueda4 = new Rueda(marca);
		this.ventana1 = new Ventana(tintada);
		this.ventana2 = new Ventana(tintada);
		this.ventana3 = new Ventana(tintada);
		this.ventana4 = new Ventana(tintada);
		this.puerta1 = new Puerta(corredera);
		this.puerta2 = new Puerta(corredera);
		this.puerta3 = new Puerta(corredera);
		this.puerta4 = new Puerta(corredera);
		this.puerta5 = new Puerta(corredera);
	}
	public void getEstadoMotor() {
		motor.isArrancado();
	}
	
	public void getEstadoRuedas() {
		if (rueda1.isInflada() == true && rueda2.isInflada() == true && rueda3.isInflada() == true && rueda4.isInflada() == true) {
			System.out.println("Todas las ruedas están hinchadas");
		} else {
			if (rueda1.isInflada() == false) {
				System.out.println("La rueda 2 está desinflada");
			}
			if (rueda2.isInflada() == false) {
				System.out.println("La rueda 2 está desinflada");
			}
			if (rueda3.isInflada() == false) {
				System.out.println("La rueda 3 está desinflada");
			}
			if (rueda4.isInflada() == false) {
				System.out.println("La rueda 4 está desinflada");
			}
		}
	}
	
	public void getEstadoVentanas() {
		if (ventana1.isAbierta() == false && ventana2.isAbierta() == false && ventana3.isAbierta() == false && ventana4.isAbierta() == false) {
			System.out.println("Todas las ventanas están cerradas");
		} else {
			if (ventana1.isAbierta() == true) {
				System.out.println("La ventana 1 está abierta");
			}
			if (ventana2.isAbierta() == true) {
				System.out.println("La ventana 2 está abierta");
			}
			if (ventana3.isAbierta() == true) {
				System.out.println("La ventana 3 está abierta");
			}
			if (ventana4.isAbierta() == true) {
				System.out.println("La ventana 4 está abierta");
			}
		}
	}
	
	public void getEstadoPuertas() {
		if (puerta1.isAbierta() == false && puerta2.isAbierta() == false && puerta3.isAbierta() == false && puerta4.isAbierta() == false) {
			System.out.println("Todas las puertas están cerradas");
		} else {
			if (puerta1.isAbierta() == true) {
				System.out.println("La puerta 1 está abierta");
			}
			if (puerta2.isAbierta() == true) {
				System.out.println("La puerta 2 está abierta");
			}
			if (puerta3.isAbierta() == true) {
				System.out.println("La puerta 3 está abierta");
			}
			if (puerta4.isAbierta() == true) {
				System.out.println("La puerta 4 está abierta");
			}
			if (puerta5.isAbierta() == true) {
				System.out.println("La puerta 4 está abierta");
			}
		}
	}
	
	public static void main (String[] args) {
					
		Furgoneta miFurgoneta = new Furgoneta("Mercedes", 2000, "Michelin", true, true); //creamos nuestra furgoneta
		
		miFurgoneta.motor.cambiarEstadoMotor();
		miFurgoneta.rueda3.inflar();
		miFurgoneta.rueda2.inflar();
		miFurgoneta.rueda1.inflar();
		miFurgoneta.ventana2.abrir();
		miFurgoneta.ventana1.abrir(); //probamos a usar los métodos de cada objeto que componen nuestro objeto furgoneta
		miFurgoneta.getEstadoPuertas();
		miFurgoneta.getEstadoVentanas();
		miFurgoneta.getEstadoRuedas(); //usamos los metodos getter para ver si han funcionado los metodos de los objetos
		
	}
}
