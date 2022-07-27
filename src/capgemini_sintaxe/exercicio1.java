package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Exercício 1");
        System.out.println("Por favor, digite um número.");
        numero1 = reader.nextInt();
        System.out.println("Agora digite um segundo número para somarmos ao primeiro.");
        numero2 = reader.nextInt();
        int soma = numero1 + numero2;
        System.out.print("Legal! A soma dos dois números é " + soma + ".");
    }
}
