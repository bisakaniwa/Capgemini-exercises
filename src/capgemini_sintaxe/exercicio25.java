package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 25");
        int numero1;
        int numero2;
        String continuar = "s";

        System.out.print("Vamos comparar dois números! ");
        while (continuar.equals("s")) {
            System.out.println("Digite o primeiro número!");
            numero1 = reader.nextInt();
            System.out.println("Legal! Agora digite o segundo número.");
            numero2 = reader.nextInt();
            if (numero1 == numero2) {
                System.out.println("Os dois números são iguais!");
            } else {
                System.out.print("Os números são diferentes! No caso, ");
                if (numero1 < numero2) {
                    System.out.println(numero1 + " é menor que " + numero2 + ".");
                }
                if (numero1 > numero2) {
                    System.out.println(numero1 + " é maior que " + numero2 + ".");
                }
            }
            System.out.println("Deseja comparar mais dois números? Digite S para sim ou N para não.");
            continuar = reader.next();
            if (continuar.equals("n")) {
                System.out.print("Obrigada por usar nosso sistema! Até a próxima :)");
            } else System.out.println("Ops! Esse caractere não é válido. Digite novamente!");
            continuar = reader.next();
        }
    }
}