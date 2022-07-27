package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 23");
        int numero;
        System.out.println("Por favor, digite um número.");
        numero = reader.nextInt();
        if (numero > 80) {
            System.out.println("Este número é maior que 80!");
        } else if (numero < 25) {
            System.out.println("Este número é menor que 25!");
        } else if (numero == 40) {
            System.out.println("Você digitou o número 40!");
        } else System.out.println("Não tenho nada a declarar sobre esse número...");
    }
}
