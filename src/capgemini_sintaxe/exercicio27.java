package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 27");
        float preco;
        float totalpreco = 0;
        float descontovariavel = 0;
        float descontofinal;
        float totaldesconto = 0;
        String combustivel;
        float precodesconto;
        float valorfinal;

        System.out.print("Olá! Bem vindo à Carango! ");
        do {
            System.out.println("Qual o valor do veículo que você está comprando?");
            preco = reader.nextFloat();
            if (preco != 0) {
                totalpreco = preco + totalpreco;
                System.out.println("Legal! Digite A caso seu veículo seja movido a álcool; G se for a gasolina ou " +
                        "D se for a diesel.");
                do {
                    combustivel = reader.next();
                    totaldesconto = 0;
                    switch (combustivel) {
                        case "A" -> descontovariavel = 0.25f;
                        case "G" -> descontovariavel = 0.21f;
                        case "D" -> descontovariavel = 0.14f;
                        default ->
                                System.out.println("Oh não, eu não fui programada para entender essa letra :( Você pode " +
                                        "digitar novamente?");
                    }
                } while (!combustivel.equals("A") && !combustivel.equals("G") && !combustivel.equals("D"));
                descontofinal = preco * descontovariavel;
                totaldesconto = descontofinal + totaldesconto;
                precodesconto = preco - descontofinal;
                System.out.println("Pelos meus cálculos, você ganhou um desconto de R$" + descontofinal + " e vai pagar um " +
                        "total de R$" + precodesconto + " por esse carro!");
                System.out.println("Insira mais um veículo à soma ou digite o valor zero caso deseje sair!");
            }
        }
        while (preco != 0);
        valorfinal = totalpreco - totaldesconto;
        System.out.println("Uau! Parece que você recebeu um total de R$" + totaldesconto + " de desconto na sua compra" +
                " e vai pagar só R$" + valorfinal + " pela sua compra! Obrigada e volte sempre!");
    }
}
