package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 10");
        float compra;
        System.out.println("Que bom que você comprou conosco! Me diga o valor da sua compra para que eu possa informar" +
                " o valor das parcelas!");
        compra = reader.nextFloat();
        float parcela = compra / 5;
        System.out.print("Obrigada! Pelos meus cálculos, cada parcela sairá por R$" + parcela + "! Volte sempre :)");
    }
}
