package capgemini_sintaxe;
import java.util.Scanner;
public class exercicio31 {
    public static void main(String[] args) {
        System.out.println("Exercício 31");
        Scanner reader = new Scanner(System.in);
        float valorA;
        float valorB;
        char c;
        float resultado = 0;

        System.out.println("Por favor, digite um valor para A.");
        valorA = reader.nextFloat();
        System.out.println("Agora digite um valor para B.");
        valorB = reader.nextFloat();
        System.out.println("Escreva um operador aritmético para efetuar a operação entre os valores A e B: multiplicação" +
                " (*), subtração (-), adição (+) ou divisão (/).");
        c = reader.next().charAt(0);
        if (c == '*') {
            resultado = valorA * valorB;
            System.out.println("O resultado da multiplicação de A por B é de " + resultado + "!");
        } else if (c == '-') {
            resultado = valorA - valorB;
            System.out.println("O resultado da subtração de A por B é de " + resultado + "!");
        } else if (c == '+') {
            resultado = valorA + valorB;
            System.out.println("O resultado da soma de A por B é de " + resultado + "!");
        } else if (c == '/' && valorB != 0) {
            resultado = valorA / valorB;
            System.out.println("O resultado da divisão de A por B é de " + resultado + "!");
        } else if (c == '/' && valorB == 0) {
            System.out.println("Não é possível fazer divisão por zero!");
        } else {
            System.out.println("Ops! Parece que você não digitou um operador aritmético!");
        }
    }
}
