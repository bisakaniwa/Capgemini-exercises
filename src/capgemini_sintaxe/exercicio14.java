package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 14");
        int numero1;
        int numero2;
        System.out.println("Vamos comparar números inteiros! Digite o primeiro número.");
        numero1 = reader.nextInt();
        System.out.println("Agora digite o segundo número!");
        numero2 = reader.nextInt();
        if(numero1 > numero2){
            System.out.print(numero1 + " é maior que " + numero2 + "!");
        }else if(numero1 == numero2){
            System.out.print(numero1 + " é igual a " + numero2 + ", duh!");
        }else System.out.print(numero1 + " é menor que " + numero2 + "!");
    }
}
