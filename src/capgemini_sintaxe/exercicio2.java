package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        float numero1;
        float numero2;
        System.out.println("Exercício 2");
        System.out.println("Com dois números farei 4 operações. Por favor, digite o primeiro número.");
        numero1 = reader.nextInt();
        System.out.println("Agora digite o segundo número.");
        numero2 = reader.nextInt();
        float soma = numero1 + numero2;
        float subtracao = numero1 - numero2;
        float multiplicacao = numero1 * numero2;
        float divisao = numero1 / numero2;
        System.out.println("Vamos lá! A soma dos números é " + soma + ".");
        System.out.println("A subtração dos números é " + subtracao + ".");
        System.out.println("A multiplicação dos números é " + multiplicacao + ".");
        System.out.print("E a divisão dos números é " + divisao + "!");
    }
}
