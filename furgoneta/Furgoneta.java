package furgoneta;

public class Furgoneta {
	private Motor motor;
	private Rueda rueda;
	private Ventana ventana;
	private Puerta puerta;

	public Furgoneta(Motor motor, Rueda rueda, Ventana ventana, Puerta puerta) {
		this.motor = motor;
		this.rueda = rueda;
		this.ventana = ventana;
		this.puerta = puerta;
	}
	public void getEstadoMotor() {
		motor.isArrancado();
	}
	
	public void getEstadoRueda() {
		rueda.isInflada();
	}
	
	public void getEstadoVentana() {
		ventana.isAbierta();
	}
	
	public void getEstadoPuerta() {
		puerta.isAbierta();
	}
	
	public static void main (String[] args) {
		Motor motor = new Motor();
		Rueda rueda = new Rueda();
		Ventana ventana = new Ventana();
		Puerta puerta = new Puerta(); // instanciamos un objeto de cada clase para poder construir nuestra furgoneta
		
		Furgoneta miFurgoneta = new Furgoneta(motor, rueda, ventana, puerta); //creamos nuestra furgoneta
		
		miFurgoneta.motor.cambiarEstadoMotor();
		miFurgoneta.rueda.inflar();
		miFurgoneta.ventana.abrir();
		miFurgoneta.puerta.abrir(); //probamos a usar los métodos de cada objeto que componen nuestro objeto furgoneta
		
		miFurgoneta.getEstadoMotor();
		miFurgoneta.getEstadoRueda();
		miFurgoneta.getEstadoVentana();
		miFurgoneta.getEstadoPuerta(); //usamos los metodos getter para ver si han funcionado los metodos de los objetos
		
	}
}
