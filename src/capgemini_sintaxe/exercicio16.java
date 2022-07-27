package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 16");
        String aluno;
        float nota1;
        float nota2;
        float nota3;
        System.out.println("Vamos descobrir a situação do aluno. Por favor, digite o nome dele.");
        aluno = reader.next();
        System.out.println("Digite sua nota na primeira prova.");
        nota1 = reader.nextFloat();
        System.out.println("Agora digite a segunda nota do aluno.");
        nota2 = reader.nextFloat();
        System.out.println("Por fim, digite a terceira nota desse aluno.");
        nota3 = reader.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        if(media >= 7 && media <= 10){
            System.out.print(aluno + " foi aprovado!");
        }else if(media <= 5 && media >=0){
            System.out.print("Oh não... Parece que " + aluno + " foi reprovado...");
        }else if(media > 5.1 && media < 6.9){
            System.out.print(aluno + " está de recuperação...");
        }else System.out.print("Opa! Parece que algo de errado não está certo. Por favor, verifique se as notas inseridas" +
                " estão todas entre 0 e 10.");
    }
}
