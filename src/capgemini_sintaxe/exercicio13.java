package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 13");
        int numero;
        System.out.println("Por favor, informe um número.");
        numero = reader.nextInt();
        if(numero < 10) {
            System.out.print("Este número é menor do que dez!");
        } else if(numero == 10){
            System.out.print("Você digitou o número dez!");
        } else System.out.print("Este número é maior do que dez!");
    }
}
