import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("OIS je zakon!");

        double visina = sc.nextDouble();
        izpisi(visina, gravitacija(visina));

        sc.close();
    }

    public static double gravitacija(double visina) {
        double rezultat = ( (6.674 * Math.pow(10, -11) * 5.972 * Math.pow(10, 24)) / (Math.pow(6.371 * Math.pow(10, 6) + visina, 2)));
        return rezultat;
    }

    public static void izpisi(double visina, double pospesek) {
        System.out.printf("VISINA: %f\n -> POSPESEK: %f", visina, pospesek);
    }

}