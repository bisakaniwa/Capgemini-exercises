package capgemini_OrObj.exercicio4;

public class exercicio4 {
    public static void main(String[] args) {

        Elevador predioB = new Elevador(0, 15, 20, 0);

        predioB.inicializa(20, 15);
        System.out.println("Capacidade " + predioB.getCapacidade());
        System.out.println("Andares " + predioB.getTotalAndares());

        predioB.entra(2);
        System.out.println("Total de pessoas: " + predioB.getNumeroPessoas());

        predioB.entra(19);
        System.out.println("Total de pessoas: " + predioB.getNumeroPessoas());

        predioB.sai(20);
        System.out.println("Total de pessoas: " + predioB.getNumeroPessoas());

        predioB.sai(2);
        System.out.println("Total de pessoas: " + predioB.getNumeroPessoas());

        predioB.sobe(15);
        System.out.println("Andar atual: " + predioB.getAndar());

        predioB.sobe(16);
        System.out.println("Andar atual: " + predioB.getAndar());

        predioB.sobe(15);
        System.out.println("Andar atual: " + predioB.getAndar());

        predioB.desce(0);
        System.out.println("Andar atual: " + predioB.getAndar());

        predioB.desce(-2);
        System.out.println("Andar atual: " + predioB.getAndar());

        predioB.desce(0);
        System.out.println("Andar atual: " + predioB.getAndar());
    }
}
