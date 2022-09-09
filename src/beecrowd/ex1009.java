package beecrowd;
import java.util.Scanner;

public class ex1009 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String VENDEDOR = reader.next();
        double FIXEDSALARY = reader.nextDouble();
        double SALETOTAL = reader.nextDouble();
        double COMISSAO = (SALETOTAL * 0.15);
        double TOTAL = (FIXEDSALARY + COMISSAO);
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
    }
}
