public class Gravitacija {
    public static void main(String[] args) {
        System.out.print("OIS je zakon!");
    }

    public static double gravitacija(double visina) {
        double rezultat = ( (6.674 * Math.pow(10, -11) * 5.972 * Math.pow(10, 24)) / (Math.pow(6.371 * Math.pow(10, 6) + visina, 2)));
        return rezultat;
    }
}
