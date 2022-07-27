package capgemini_sintaxe;

import java.util.*;

public class exercicio30 {
    public static void main(String[] args) {
        System.out.println("Exercício 30");
        Scanner reader = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;
        int posicao1 = 0;
        int posicao2 = 0;
        int posicao3 = 0;

        System.out.println("Olá! Por favor, digite um número inteiro.");
        valor1 = reader.nextInt();
        System.out.println("Agora digite um segundo número inteiro, diferente do primeiro.");
        valor2 = reader.nextInt();
        System.out.println("Digite um último valor inteiro, diferente dos dois anteriores.");
        valor3 = reader.nextInt();
        List<Integer> estamerda = new ArrayList<>();
        estamerda.add(valor1);
        estamerda.add(valor2);
        estamerda.add(valor3);
        Collections.sort(estamerda);

//        if (valor1 > valor2 && valor1 > valor3) {
//            posicao3 = valor1;
//        } else if (valor2 > valor1 && valor2 > valor3) {
//            posicao3 = valor2;
//        } else if (valor3 > valor1 && valor3 > valor2) {
//            posicao3 = valor3;
//        }
//        if (valor1 < valor2 && valor1 < valor3) {
//            posicao1 = valor1;
//        } else if (valor2 < valor1 && valor2 < valor3) {
//            posicao1 = valor2;
//        } else if (valor3 < valor1 && valor3 < valor2) {
//            posicao1 = valor3;
//        }
//        if (valor1 < valor2 && valor1 > valor3) {
//            posicao2 = valor1;
//        } else if (valor1 > valor2 && valor1 < valor3) {
//            posicao2 = valor1;
//        } else if (valor2 > valor1 && valor2 < valor3) {
//            posicao2 = valor2;
//        } else if (valor2 < valor1 && valor2 > valor3) {
//            posicao2 = valor2;
//        } else if (valor3 > valor1 && valor3 < valor2) {
//            posicao2 = valor3;
//        } else if (valor3 < valor1 && valor3 > valor2) {
//            posicao2 = valor3;
//        } System.out.print("A ordem crescente desses números é " + posicao1 + ", " + posicao2 + " e " + posicao3);
        System.out.println("A ordem crescente desses números é " + estamerda.get(0) + ", "+ estamerda.get(1)+" ,"+ estamerda.get(2));
    }
}
