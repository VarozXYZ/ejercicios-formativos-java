package furgoneta;

public class Puerta {
	private boolean abierta;
	private boolean corredera;
	private boolean isVentana;
	
	public Puerta (boolean corredera) {
		this.corredera = corredera;
		this.isVentana = false;
	}
	
	public Puerta (boolean corredera, boolean isVentana) {
		this.corredera = corredera;
		this.isVentana = isVentana;
	}
		
	public boolean isAbierta() {
		 if (abierta)  return true;
	        else return false;
   }
	
	public void abrir() {
		abierta = true;
	}
	
	public void cerrar() {
		abierta = false;
	}
}
