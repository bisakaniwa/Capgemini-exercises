package beecrowd;
import java.util.Scanner;

public class ex1007 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int A = reader.nextInt();
        int B = reader.nextInt();
        int C = reader.nextInt();
        int D = reader.nextInt();
        int DIFERENCA = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
