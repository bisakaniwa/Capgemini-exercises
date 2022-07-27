package capgemini_sintaxe;
import java.util.Scanner;
public class exercicio29 {
    public static void main(String[] args) {
        System.out.println("Exercício 29");
        Scanner reader = new Scanner(System.in);
        int mes;
        String continuar = "s";

        while (continuar.equals("s") || continuar.equals("S")) {
            System.out.println("Digite o número do mês.");
            mes = reader.nextInt();
            switch (mes) {
                case 1 -> System.out.println("Esse número corresponde ao mês de janeiro!");
                case 2 -> System.out.println("Esse número corresponde ao mês de fevereiro!");
                case 3 -> System.out.println("Esse número corresponde ao mês de março!");
                case 4 -> System.out.println("Esse número corresponde ao mês de abril!");
                case 5 -> System.out.println("Esse número corresponde ao mês de maio!");
                case 6 -> System.out.println("Esse número corresponde ao mês de junho!");
                case 7 -> System.out.println("Esse número corresponde ao mês de julho!");
                case 8 -> System.out.println("Esse número corresponde ao mês de agosto!");
                case 9 -> System.out.println("Esse número corresponde ao mês de setembro!");
                case 10 -> System.out.println("Esse número corresponde ao mês de outubro!");
                case 11 -> System.out.println("Esse número corresponde ao mês de novembro!");
                case 12 -> System.out.println("Esse número corresponde ao mês de dezembro!");
                default -> System.out.println("Ops! Acho que esse mês não existe!");
            }
            System.out.println("Deseja fazer outra consulta? Digite S para sim ou N para não.");
            continuar = reader.next();
            if (continuar.equals("n") || continuar.equals("N")) {
                System.out.print("Obrigada por consultar conosco! Até mais!");
            break;
            }
        }
    }
}
