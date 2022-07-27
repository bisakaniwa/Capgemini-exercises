package capgemini_sintaxe;

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float km;
        float gasolina;
        System.out.println("Exercício 3");
        System.out.println("Vamos descobrir quanto seu veículo consome! Por favor, digite uma distância em " +
                "quilômetros.");
        km = reader.nextFloat();
        System.out.println("E quantos litros de gasolina seu veículo consumiu ao percorrer essa distância?");
        gasolina = reader.nextFloat();
        float consumo = gasolina / km;
        System.out.print("Olha só! Seu veículo faz " + consumo + " litros por quilômetro!");
    }
}
