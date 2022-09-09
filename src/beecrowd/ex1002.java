package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);
        double r;
        double pi = 3.14159;
        r = reader.nextDouble();
        double A = (pi * Math.pow(r, 2));
        System.out.printf("A=%.4f\n", A);
    }
}
