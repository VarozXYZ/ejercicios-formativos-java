package furgoneta;

public class Ventana extends Puerta {
	private boolean abierta;
	private boolean tintada;
		
	
	public Ventana (boolean tintada) {
		super(false, true);
		this.tintada = tintada;
	}
	
}

