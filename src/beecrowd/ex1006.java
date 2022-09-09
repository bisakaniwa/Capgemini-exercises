package beecrowd;
import java.util.Scanner;
import java.util.Locale;

public class ex1006 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double A = reader.nextDouble();
        double B = reader.nextDouble();
        double C = reader.nextDouble();
        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
