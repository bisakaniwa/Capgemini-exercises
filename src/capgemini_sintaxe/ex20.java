package capgemini_sintaxe;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 20");
        String continuar = "s";
        float valorcheio;
        float desconto;
        int ano;
        int velho = 0;
        int total = 0;
        float valorfinal;
        String opcao;
        while (!continuar.equals("n")) {
            System.out.println("Olá! Por favor, digite o valor do carro para que eu calcule o desconto!");
            valorcheio = reader.nextFloat();
            System.out.println("Legal! Agora eu preciso saber de que ano é esse carro. Por favor, digite um único ano.");
            ano = reader.nextInt();
            if (ano <= 2000) {
                desconto = 0.12f;
                velho++;
                total++;
            } else {
                desconto = 0.07f;
                total++;
            }
            desconto = valorcheio * desconto;
            valorfinal = valorcheio - desconto;
            System.out.println("Uau! Você ganhou R$" + desconto + " de desconto e vai pagar R$" + valorfinal +
                    " pelo seu carro!");
            System.out.println("Deseja continuar? Digite S para sim ou N para não.");
            opcao = reader.next();
            switch (opcao) {
                case "s" -> continuar = "s";
                case "n" -> continuar = "n";
                default -> {
                    System.out.println("Esse comando é inválido!");
                    opcao = reader.next();
                }
            }
        }
        System.out.println("Você comprou " + total + " carros, sendo que " + velho + " são anteriores ao ano 2000!");
    }
}
