public class Conversor {
    public float numero;

    public Conversor(float numero) {
        this.numero = numero;
    }

    public float M_C() {
        return numero*100;
    }

    public float M_MM() {
        return numero*1000;
    }

    public float M_PG() {
        return numero*39.37f;
    }

    public float M_P() {
        return numero*3.28f;
    }

    public float M_Y() {
        return numero*1.09f;
    }

    public static void main(String[] args) {
        Conversor conversor = new Conversor(1);
        System.out.println(conversor.M_C());
        System.out.println(conversor.M_MM());
        System.out.println(conversor.M_P());
        System.out.println(conversor.M_Y());
        System.out.println(conversor.M_PG());
               
    }
}
