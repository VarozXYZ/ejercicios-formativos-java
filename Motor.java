public class Motor {
	private int cilindrada;
	private boolean arrancado; // Por default, un boolean se autodeclara false
	
	public Motor(int cilindrada) {
		this.cilindrada = cilindrada;
	}

  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  public int getCilindrada() {
    return cilindrada;
  }
	
	public void cambiarMotor() {
		if (arrancado == true) {
			arrancado = false;
			System.out.println("Motor apagado");
		} else {
			arrancado = true;
			System.out.println("Motor encendido");
		}
	}
	
	public static void main (String[] args) {
		Motor motor1 = new Motor(2000);
		motor1.cambiarMotor();
		motor1.cambiarMotor();
    System.out.println(motor1.getCilindrada());
	}
}
