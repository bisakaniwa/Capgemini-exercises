package capgemini_sintaxe;
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Exercício 17");
        float numero;
        int quantidade = 0;
        for(float i = 1; i <= 80; i++){
            System.out.println("Por favor, digite um número.");
            numero = reader.nextFloat();
            if(numero >= 10 && numero <= 150){
                    quantidade++;
            }
        }System.out.print("Foram digitados " + quantidade + " números entre 10 e 150!");
    }
}
