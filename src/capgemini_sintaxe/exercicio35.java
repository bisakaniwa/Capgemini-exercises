package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio35 {
    public static void main(String[] args) {
        System.out.println("Exercício 35");
        Scanner reader = new Scanner(System.in);
        String tipo;
        float consumo;
        float conta = 0;

        System.out.println("Olá! Vamos descobrir o valor da sua conta de energia neste mês. Por favor, digite A caso " +
                "a consulta seja para uma residência, digite B se para um comércio ou C se para uma indústria.");
        tipo = reader.next();
        while (!tipo.equals("A") && !tipo.equals("B") && !tipo.equals("C")) {
            System.out.println("Este caractere não é válido! Por favor, digite novamente.");
            tipo = reader.next();
        }
        System.out.println("Agora, por favor, informe seu consumo neste mês.");
        consumo = reader.nextFloat();
        switch (tipo) {
            case "A" -> conta = consumo * 0.6f;
            case "B" -> conta = consumo * 0.48f;
            case "C" -> conta = consumo * 1.29f;
        }
        System.out.println("Sua conta neste mês será de R$" + conta + ".");
    }
}
