package furgoneta;

public class Rueda {
	private boolean inflada;
	
	 public void isInflada() {
	        if (inflada == true) 
	        	System.out.println("La rueda está inflada");
	        else System.out.println("La rueda está vacía");
	    }
	public void inflar() {
		inflada = true;
	}
	
	public void desinflar() {
		inflada = false;
	}
}
