package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 9");
        float deposito;
        System.out.println("Vamos descobrir quanto dinheiro você terá no próximo mês! Quanto você depositou?");
        deposito = reader.nextFloat();
        float rendimento = deposito * 0.0007f;
        float mes1 = deposito + rendimento;
        System.out.print("Opa! Parece que mês que vem você vai ter R$" + mes1 + " na sua conta!");
    }
}
