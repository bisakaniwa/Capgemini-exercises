package beecrowd;
import java.util.Scanner;
import java.util.Locale;

public class ex1008 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int NUMBER = reader.nextInt();
        int HORAS = reader.nextInt();
        float PORHORA = reader.nextFloat();
        float SALARY = (HORAS * PORHORA);
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
    }
}
