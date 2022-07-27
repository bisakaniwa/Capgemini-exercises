package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String vendedor;
        double fixo;
        double vendas;
        double comissao;
        System.out.println("Exercício 4");
        System.out.println("Vamos descobrir quanto seu vendedor receberá pelo mês de vendas, no total. Por favor, " +
                "digite o nome do vendedor.");
        vendedor = reader.next();
        System.out.println("De quanto é o salário fixo deste vendedor?");
        fixo = reader.nextFloat();
        System.out.println("E quanto ele vendeu nesse mês, em reais?");
        vendas = reader.nextFloat();
        comissao = vendas * 0.15;
        double salariototal;
        salariototal = fixo + comissao;
        System.out.println("Somando o salário de R$" + fixo + " e a comissão de R$" + comissao + ", você pagará a " +
                vendedor + " um total de R$" + salariototal + " este mês!");
    }
}
