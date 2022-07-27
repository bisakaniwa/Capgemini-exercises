package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 20");
        float valorcheio;
        int ano;
        boolean continuar;
        int velho = 0;
        velho++;
        System.out.println("Olá! Por favor, digite o valor do primeiro carro para que eu calcule o desconto!");
        valorcheio = reader.nextFloat();
        System.out.println("Legal! Agora eu preciso saber de que ano é esse carro. Por favor, digite um único ano.");
        ano = reader.nextInt();
        if (ano <= 2000) {
            float descontovelho = valorcheio * 0.12f;
            float carrovelho = valorcheio + descontovelho;
            velho++;
            System.out.println("Uau! Você ganhou R$" + descontovelho + " de desconto e vai pagar R$" + carrovelho +
                    " pelo seu carro!");
        } else {
            float descontonovo = valorcheio * 0.07f;
            float carronovo = valorcheio + descontonovo;
            System.out.println("Uau! Você ganhou R$" + descontonovo + " de desconto e vai pagar R$" + carronovo +
                    " pelo seu carro!");
        }
        System.out.println("Você comprou algum outro carro? Digite S para sim ou N para não.");
        continuar = reader.nextBoolean();
        if (continuar == true) {
            System.out.println("Por favor, digite o valor integral do próximo carro!");
            valorcheio = reader.nextFloat();
            System.out.println("Agora me diga: de que ano é este carro?");
            ano = reader.nextInt();
            if (ano <= 2000) {
                float descontovelho = valorcheio * 0.12f;
                float carrovelho = valorcheio + descontovelho;
                velho++;
                System.out.println("Uau! Você ganhou R$" + descontovelho + " de desconto e vai pagar R$" + carrovelho +
                        " pelo seu carro!");
            } else {
                float descontonovo = valorcheio * 0.07f;
                float carronovo = valorcheio + descontonovo;
                System.out.println("Uau! Você ganhou R$" + descontonovo + " de desconto e vai pagar R$" + carronovo +
                        " pelo seu carro!");
            }
            System.out.println("Você comprou algum outro carro? Digite S para sim ou N para não.");
            continuar = reader.nextBoolean();
        } else if (continuar == false) {
            System.out.println("Ok! Deixe-me checar suas informações.");
            System.out.print("Aqui consta que você comprou um total de " + velho + " carros anteriores ao ano 2000 e" +
                    " vai pagar um total de R$" + " por eles! Volte sempre!");
        } else System.out.print("Desculpe! Esse comando não é válido.");
    }
}
