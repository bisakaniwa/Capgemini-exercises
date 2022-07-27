package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 7");
        float c;
        System.out.println("Vamos descobrir quantos graus Fahreinheit equivalem aos nossos Celsius! Por favor, digite" +
                " a temperatura em graus Celsius.");
        c = reader.nextFloat();
        float f = (9 * c + 160) / 5;
        System.out.print("Legal! " + c + " graus Celsius equivalem a " + f + " graus Fahreinheit!");
    }
}
