package capgemini_sintaxe;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        System.out.println("Exercício 33");
        Scanner reader = new Scanner(System.in);
        float nivel1 = 12f;
        float nivel2 = 17f;
        float nivel3 = 25f;
        int aulas;
        int nivelprof;
        float salario;

        System.out.println("Por favor, digite quantas aulas o professor ministrou neste mês.");
        aulas = reader.nextInt();
        System.out.println("Agora digite o nível correspondente às aulas deste professor: 1, 2 ou 3.");
        nivelprof = reader.nextInt();

        while (nivelprof != 1 && nivelprof != 2 && nivelprof != 3) {
            System.out.println("Esse não é um nível válido! Digite novamente.");
            nivelprof = reader.nextInt();
        }
        if (nivelprof == 1) {
            salario = aulas * nivel1;
        } else if (nivelprof == 2) {
            salario = aulas * nivel2;
        } else {
            salario = aulas * nivel3;
        }
        System.out.println("O salário deste professor será de R$"+ salario +" este mês.");
}
}