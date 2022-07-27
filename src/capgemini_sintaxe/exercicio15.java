package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 15");
        float numero;
        System.out.println("Digite um número e eu te direi se ele está no intervalo entre 100 e 200!");
        numero = reader.nextFloat();
        if(numero > 100 && numero < 200){
            System.out.print("Esse número está entre 100 e 200!");
        }else System.out.print("Oh não, esse número não está entre 100 e 200 :(");
    }
}
