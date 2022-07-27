package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 11");
        float custo;
        float porcento;
        System.out.println("Vamos descobrir o valor de venda do seu produto! Quanto você pagou por ele (valor de custo)?");
        custo = reader.nextFloat();
        System.out.println("E quantos por cento (%) você deseja acrescentar ao valor de custo?");
        porcento = reader.nextFloat();
        float emdecimal = porcento * 0.01f;
        float acrescimo = custo * emdecimal;
        float venda = custo + acrescimo;
        System.out.print("Bem, parece que você venderá seu produto por R$" + venda + "!");
    }
}
