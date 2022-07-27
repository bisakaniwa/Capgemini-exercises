package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float cotacaodolar;
        float dolares;
        System.out.println("Vamos converter seus dólares em reais! Digite o valor desejado em dólares.");
        dolares = reader.nextFloat();
        System.out.println("Legal! Agora eu preciso saber quanto está a cotação do dólar hoje. Você poderia me" +
                " informar?");
        cotacaodolar = reader.nextFloat();
        float reais = dolares * cotacaodolar;
        System.out.print("Oba! Parece que você tem um total de " + reais + " reais!");
    }
}
