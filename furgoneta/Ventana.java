package furgoneta;

public class Ventana {
	private boolean abierta;
	
	 public void isAbierta() {
        if (abierta == true) 
        	System.out.println("La ventana está abierta");
        else System.out.println("La ventana está cerrada");
    }
	
	public void abrir() {
		abierta = true;
	}
	
	public void cerrar() {
		abierta = false;
	}
}
