package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 19");
        String nome;
        int idade;
        String genero;
        int homens = 0;
        int mulheres = 0;
        int outros = 0;
        for (int i = 1; i <= 56; i++) {
            System.out.println("Por favor, digite o nome da pessoa.");
            nome = reader.next();
            System.out.println("Quantos anos tem essa pessoa?");
            idade = reader.nextInt();
            System.out.println("Essa pessoa se considera homem, mulher ou outro? Digite H, M ou O.");
            genero = reader.next();
            if (genero.equals("h")) {
                homens++;
                System.out.println(nome + " tem " + idade + " anos e se considera homem.");
            } else if (genero.equals("m")) {
                mulheres++;
                System.out.println(nome + " tem " + idade + " anos e se considera mulher.");
            } else if (genero.equals("o")) {
                outros++;
                System.out.println(nome + " tem " + idade + " anos e não se considera pertencente ao campo " +
                        "binário.");
            } else System.out.println("Desculpe, essa alternativa não é válida!");
        }
        System.out.print(homens + " pessoas se consideram homens, " + mulheres + " pessoas se consideram mulheres e " +
                outros + " pessoas não se consideram pertencentes ao campo binário de gênero.");
    }
}
