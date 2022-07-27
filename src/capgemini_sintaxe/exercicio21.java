package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 21");

        String nome;
        int idade;
        String sexo;
        String saude = null;
        int masculino = 0;
        int feminino = 0;
        int apto = 0;
        int inapto = 0;
        String continuar = "c";
        int total = 1;

        while (continuar.equals("c")) {
            System.out.println("Insira o nome da pessoa.");
            nome = reader.next();
            sexo = null;
            System.out.println("Essa pessoa é do sexo masculino ou feminino? Digite M para masculino ou F para feminino.");
            while (sexo == null) {
                sexo = reader.next();
                switch (sexo) {
                    case "m" -> {
                        sexo = "m";
                        masculino++;
                    }
                    case "f" -> {
                        sexo = "f";
                        feminino++;
                    }
                    default -> {
                        System.out.println("Caractere inválido. Digite novamente.");
                        sexo = null;
                    }
                }
            }
            System.out.println("Quantos anos tem essa pessoa?");
            idade = reader.nextInt();
            if (idade < 18 || idade > 30) {
                System.out.println("Essa pessoa não está apta por conta da idade.");
            } else {
                saude = null;
                System.out.println("Esta pessoa está saudável? Digite S para sim ou N para não.");
                while (saude == null) {
                    saude = reader.next();
                    switch (saude) {
                        case "n" -> {
                            saude = "n";
                            System.out.println("Essa pessoa não está apta por conta da saúde.");
                        }
                        case "s" -> saude = "s";
                        default -> {
                            System.out.println("Caractere inválido. Digite novamente.");
                            saude = null;
                        }
                    }
                }
            }

            if ((idade >= 18 && idade <= 30) && (saude.equals("s"))) {
                apto++;
            } else inapto++;
            System.out.println("Deseja inserir os dados de mais uma pessoa? Digite C para continuar ou NC para não " +
                    "continuar.");
            continuar = reader.next();
            if (continuar.equals("c")) {
                total++;
            }
        }
        if (continuar.equals("nc")) {
            System.out.print("No total participaram " + total + " pessoas, dentre elas " + masculino + " homens e " +
                    feminino + " mulheres. Dentre as " + total + " pessoas, " + apto + " estão aptas para servir" +
                    " ao exército e " + inapto + " estão inaptas.");
        }
    }
}