package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 24");
        int numero;
        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.println("Por favor, digite um número.");
            numero = reader.nextInt();
            if (numero > 0) {
                System.out.println("Este é um número positivo!");
            } else if (numero == 0) {
                System.out.println("Este número é nulo (é 0)!");
            } else System.out.println("Este número é negativo!");
            System.out.println("Deseja consultar outro número? Digite S para sim ou N para não.");
            continuar = reader.next();
            if (continuar.equals("n")) {
                System.out.print("Obrigada por usar nosso sistema! Até a próxima :)");
            } else System.out.println("Ops! Esse caractere não é válido!");
            continuar = reader.next();
        }
    }
}
