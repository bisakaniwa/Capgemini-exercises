package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        System.out.println("Exercício 32");
        Scanner reader = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Por favor, digite um número inteiro.");
        ladoA = reader.nextInt();
        System.out.println("Agora digite um segundo número inteiro.");
        ladoB = reader.nextInt();
        System.out.println("Agora um último valor inteiro.");
        ladoC = reader.nextInt();

        if (ladoA > (ladoB + ladoC) || ladoB > (ladoA + ladoC) || ladoC > (ladoA + ladoB)) {
            System.out.println("Os três números não formam um triângulo!");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("Estes números formam um triângulo isósceles!");
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Além disso, esse triângulo também é equilátero!");
            }
        } else {
            System.out.println("Estes números formam um triângulo escaleno!");
        }

    }
}
