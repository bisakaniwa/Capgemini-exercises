package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 26");
        int numero;
        String continuar;

        do {
            System.out.println("Por favor, digite um número de 1 a 5!");
            do {
                numero = reader.nextInt();
                if (numero == 1) {
                    System.out.println("Esse é o número um!");
                } else if (numero == 2) {
                    System.out.println("Esse é o número dois!");
                } else if (numero == 3) {
                    System.out.println("Esse é o número três!");
                } else if (numero == 4) {
                    System.out.println("Esse é o número quatro!");
                } else if (numero == 5) {
                    System.out.println("Esse é o número cinco!");
                } else System.out.println("Número inválido! Tente digitar um número entre 1 e 5!");
            } while (numero < 1 || numero > 5);
            System.out.println("Deseja consultar outro número? Digite S para sim ou N para não.");
            do {
                continuar = reader.next();
                if (!continuar.equals("s") && !continuar.equals("n")) {
                    System.out.println("Ops! Caractere inválido. Você deseja continuar? S ou N?");
                }
            } while (!continuar.equals("n") && !continuar.equals("s"));
        } while (!continuar.equals("n"));
            System.out.print("Obrigada por usar nosso sistema! Até a próxima :)");
    }
}


