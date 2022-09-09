package beecrowd;
import java.util.Scanner;
import java.util.Locale;

public class ex1005 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        float A = reader.nextFloat();
        float B = reader.nextFloat();
        float MEDIA = ((A * 3.5f) + (B * 7.5f)) / (3.5f + 7.5f );
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}
