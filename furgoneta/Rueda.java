package furgoneta;

public class Rueda {
	private boolean inflada;
	private String marca;
	
	public Rueda (String marca) {
		this.marca = marca;
	}
	
	 public boolean isInflada() {
	        if (inflada)  return true;
	        else return false;
	    }
	public void inflar() {
		inflada = true;
	}
	
	public void desinflar() {
		inflada = false;
	}
}
