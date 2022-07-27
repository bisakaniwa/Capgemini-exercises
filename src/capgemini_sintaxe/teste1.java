package capgemini_sintaxe;

import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String saude = null;
        int apto = 0;
        int inapto = 0;

        System.out.println("Esta pessoa está saudável? Digite S para sim ou N para não.");

        while (saude == null) {
            saude = reader.next();
            switch (saude) {
                case "n" -> {
                    saude = "n";
                    inapto++;
                    System.out.println("Essa pessoa não está apta por conta da saúde.");
                    }
                case "s" -> {
                    saude = "s";
                    apto++;
                }
                default -> {
                    System.out.println("Caractere inválido. Digite novamente.");
                    saude = null;

                }
            }
        }
        System.out.print("Há " + apto + " pessoas aptas e " + inapto + " pessoas inaptas.");
    }
}
