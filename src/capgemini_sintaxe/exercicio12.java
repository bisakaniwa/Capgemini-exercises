package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 12");
        float custo;
        System.out.println("Vamos descobrir quanto o consumidor final pagará pelo seu carro! Por favor, digite o preço" +
                " de custo.");
        custo = reader.nextFloat();
        float impostos = custo * 0.45f;
        float comimpostos = custo + impostos;
        float distribuidor = comimpostos * 0.28f;
        float consumidor = comimpostos + distribuidor;
        System.out.print("O consumidor pagará R$" + consumidor + " pelo carro!");
    }
}
