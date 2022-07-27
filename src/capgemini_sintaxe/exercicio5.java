package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String aluno;
        float nota1;
        float nota2;
        float nota3;
        System.out.println("Vamos descobrir sua média neste semestre! Por favor, digite a nota da sua primeira prova.");
        nota1 = reader.nextFloat();
        System.out.println("Agora informe, por favor, a sua segunda nota.");
        nota2 = reader.nextFloat();
        System.out.println("Por fim, informe sua terceira nota!");
        nota3 = reader.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.print("Sua média final é de " + media + "!");
    }
}
