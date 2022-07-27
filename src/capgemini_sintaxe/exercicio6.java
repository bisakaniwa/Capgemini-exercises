package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float a;
        float b;
        float troca;
        System.out.println("Exercício 6");
        System.out.println("Vamos trocar valores! Digite um valor para a variável A.");
        a = reader.nextFloat();
        System.out.println("Legal! Agora digite um valor para a variável B.");
        b = reader.nextFloat();
        System.out.print("Agora a variável A vale " + b + " e a variável B vale " + a + "!");
    }

}
