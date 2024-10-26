public class Resta {
    
    public int Resta2 (int n1, int n2) {
        return n1 - n2;
    }

    public int Resta3 (int n1, int n2, int n3) {
        return n1 - n2 - n3;
    }

    public double RestaDoble1 (double n1, double n2) {
        return n1 - n2;
    }

    public double RestaDoble2 (double n1, double n2, double n3) {
        return n1 - n2 - n3;
    }

    public static void main (String[] args) {
    Resta resta = new Resta();
    System.out.println(resta.RestaDoble2(10.5d, 7d, 0.5d));
    }
}
