package tetera;

public class Tetera {
	private int _capacidadActual;
	private int _capacidadMaxima;
	
	public Tetera() {
		_capacidadActual = 0;
		_capacidadMaxima = 1000;
		System.out.println("Creada tetera con capacidad máxima " + _capacidadMaxima + " y llena con " + _capacidadActual + "cc de te");
	}
	
	public Tetera(int capacidadMaxima) {
		this._capacidadMaxima = capacidadMaxima;
		_capacidadActual = capacidadMaxima;
		System.out.println("Creada tetera con capacidad máxima " + _capacidadMaxima + " y llena por completo");
	}
	 
	public Tetera(int capacidadMaxima, int capacidadActual) {
		_capacidadActual = capacidadActual;
		_capacidadMaxima = capacidadMaxima;
		if (_capacidadActual > _capacidadMaxima) {
			_capacidadActual = _capacidadMaxima;
			System.out.println("Has intentado crear una tetera con una capacidad no puede superar " + 
			_capacidadMaxima + " cc. Creada tetera con capacidad máxima " + _capacidadMaxima + " y llena por completo");
		} else
			System.out.println("Creada tetera con capacidad máxima " + _capacidadMaxima + " y llena con " + _capacidadActual + "cc de te");
	}
	
	public int getCapacidadActual() {
		System.out.println("La " + this + "tiene actualmente " + _capacidadActual + "cc");
		return _capacidadActual;
	}
	
	public int getCapacidadMaxima() {
		System.out.println("La capacidad máxima de " + this + "es de " + _capacidadMaxima);
		return _capacidadMaxima;
	}
	
	public void setCapacidadActual(int nuevaCapacidadActual) {
		this._capacidadActual = nuevaCapacidadActual;
	}
	
	public void setCapacidadMaxima (int nuevaCapacidadMaxima) {
		this._capacidadMaxima = nuevaCapacidadMaxima;
	}
	
	public void llenarTe() {
		_capacidadActual = _capacidadMaxima;
		System.out.println("Llenada por completa la " + this);
	}
	
	public void servirTaza(int capacidadTaza) {
		if (_capacidadActual < capacidadTaza) {
			System.out.println("Solo has podido llenar " + (capacidadTaza - _capacidadActual) + "cc de los " + 
			capacidadTaza + " cc que tiene la taza");
			_capacidadActual = 0;
		} else {
			_capacidadActual-= capacidadTaza;
			System.out.println("Llenada taza entera. Capacidad restante en" + this + " de " + (_capacidadActual - capacidadTaza) + "cc");
		}
	}
	
	public void vaciarTe() {
		_capacidadActual = 0;
		System.out.println("Vaciada la " + this);
	}
	
	public void agregarCafe(int cantidadAgregada) {
		if (_capacidadActual + cantidadAgregada > _capacidadMaxima) {
			System.out.println("Solo se ha podido agregar " + (_capacidadMaxima - _capacidadActual) + "a " + this);
		} else {
			_capacidadActual+= cantidadAgregada;
			System.out.println("Llenados " + cantidadAgregada + "cc de te a " + this + ". Capacidad actual: " + _capacidadActual + "cc.");
		}
	}
	
	public static void main(String[] args) {
		Tetera teteraDefault = new Tetera();
		
		Tetera teteraMaxima = new Tetera(1500);
		
		Tetera teteraSuperada = new Tetera(1500, 2000);
		
		teteraDefault.llenarTe();
		
		teteraDefault.servirTaza(1500);
		
		teteraMaxima.getCapacidadActual();
		teteraMaxima.vaciarTe();
		teteraMaxima.getCapacidadActual();
		
		teteraMaxima.agregarCafe(2000);
	}
}
