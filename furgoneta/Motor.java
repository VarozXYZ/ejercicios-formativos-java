package furgoneta;

public class Motor {
    private boolean arrancado; // Por default, un boolean se autodeclara false

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
    public void isArrancado() {
        if (arrancado == true) 
        	System.out.println("El motor está arrancado");
        else System.out.println("El motor está apagado");
    }
}
