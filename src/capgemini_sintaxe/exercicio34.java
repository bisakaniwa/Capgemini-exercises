package capgemini_sintaxe;
import java.util.Scanner;
public class exercicio34 {
    public static void main(String[] args) {
        System.out.println("Exercício 34");
        Scanner reader = new Scanner(System.in);
        int idade;

        System.out.println("Por favor, informe a idade do nadador.");
        idade = reader.nextInt();
        if (idade < 5 || idade > 25) {
            System.out.println("Idade fora da faixa etária.");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println("Este nadador está na classe Infantil A.");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Este nadador está na classe Infantil B.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Este nadador está na classe Juvenil A.");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Este nadador está na classe Juvenil B.");
        } else System.out.println("Este nadador está na classe Sênior.");
    }
}
