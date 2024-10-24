package furgoneta;

public class Puerta {
	private boolean abierta;
	
	public void isAbierta() {
        if (abierta == true) 
        	System.out.println("La puerta está abierta");
        else System.out.println("La puerta está cerrada");
    }
	
	public void abrir() {
		abierta = true;
	}
	
	public void cerrar() {
		abierta = false;
	}
}
