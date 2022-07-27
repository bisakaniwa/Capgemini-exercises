package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        System.out.println("Exercício 22");
        Scanner reader = new Scanner(System.in);

        float custo;
        float venda;
        float totalcusto = 0;
        float totalvenda = 0;

        System.out.print("Bem vindo ao nosso sistema! ");
        for (int i = 1; i <= 40; i++) {
            System.out.println("Por favor, digite o preço de custo do produto.");
            custo = reader.nextFloat();
            System.out.println("Agora digite o preço de venda do mesmo produto.");
            venda = reader.nextInt();
            float diferenca = venda - custo;
            if (diferenca > 0) {
                System.out.println("O preço de custo foi de R$" + custo + " e o preço de venda foi de R$" + venda + ". " +
                        "Houve R$" + diferenca + " de lucro!");
            } else if (diferenca == 0) {
                System.out.println("O preço de custo foi de R$" + custo + " e o preço de venda foi de R$" + venda + ". " +
                        "Não houve nem lucro, nem prejuízo!");
            } else {
                System.out.println("O preço de custo foi de R$" + custo + " e o preço de venda foi de R$" + venda + ". " +
                        "Infelizmente houve prejuízo :(");
            }
            totalcusto = totalcusto + custo;
            totalvenda = totalvenda + venda;
        }
        float mediacusto = totalcusto / 40;
        float mediavenda = totalvenda / 40;
        System.out.print("No fim das contas, você pagou, em média, R$" + mediacusto + " por cada produto e vendeu " +
                "cada um por R$" + mediavenda + " em média!");

    }
}