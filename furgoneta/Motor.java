package furgoneta;

public class Motor {
    private boolean arrancado; // Por default, un boolean se autodeclara false
    private int cilindrada;
    
    
    public Motor (int cilindrada) {
    	this.cilindrada = cilindrada;
    }

    // Método para cambiar el estado del motor (encendido/apagado)
    public void cambiarEstadoMotor() {
        if (arrancado == true) {
            arrancado = false;
            System.out.println("Motor apagado");
        } else {
            arrancado = true;
            System.out.println("Motor encendido");
        }
    }

    // Método para obtener el estado del motor (si está arrancado o no)
    public boolean isArrancado() {
        if (arrancado)  return true;
        else return false;
    }
}
