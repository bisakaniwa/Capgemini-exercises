package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 28");
        String nome;
        float salariovelho;
        float salariominimo;
        float reajuste;
        float salarionovo;
        float totalvelho = 0;
        float totalnovo = 0;
        float diferenca;

        System.out.print("Hora de reajustar o salário de nossos funcionários! ");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Por favor, digite o nome do funcionário.");
            nome = reader.next();
            System.out.println("Agora digite o salário deste funcionário.");
            salariovelho = reader.nextFloat();
            System.out.println("De quanto é o valor do salário mínimo neste momento?");
            salariominimo = reader.nextFloat();
            totalvelho = totalvelho + salariovelho;

            if (salariovelho < 3 * salariominimo) {
                reajuste = 0.5f;
            } else if (salariovelho >= 3 * salariominimo && salariovelho <= 10 * salariominimo) {
                reajuste = 0.2f;
            } else if (salariovelho > 10 * salariominimo && salariovelho <= 10 * salariominimo) {
                reajuste = 0.15f;
            } else reajuste = 0.1f;
            salarionovo = (salariovelho * reajuste) + salariovelho;
            totalnovo = totalnovo + salarionovo;
            System.out.println(nome + " vai ganhar um reajuste de R$" + (salariovelho * reajuste) + " e seu novo " +
                    "salário passa a ser de R$" + salarionovo + ".");
        }
        diferenca = totalnovo - totalvelho;
        System.out.print("Ao final do período de reajuste, a empresa terá um acréscimo de R$" + diferenca + " na sua " +
                "folha de pagamento no final de cada mês.");
    }
}