package capgemini_sintaxe;
import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 18");
        int idade;
        for (int i = 1; i <= 75; i++) {
            System.out.println("Qual a idade da pessoa?");
            idade = reader.nextInt();
            if (idade >= 18) {
                System.out.println("Essa pessoa é maior de idade!");
            } else System.out.println("Essa pessoa é menor de idade!");
        }
    }
}
