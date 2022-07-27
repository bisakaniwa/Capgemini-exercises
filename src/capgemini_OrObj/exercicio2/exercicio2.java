package capgemini_OrObj.exercicio2;

public class exercicio2 {
    public static void main(String[] args) {
    ContaCorrente conta = new ContaCorrente(0001, "João", 0f);
        System.out.println(conta);

        conta.alterarNome("Lucas");
        conta.deposito(300);
        conta.deposito(200);
        System.out.println(conta);

        conta.saque(100);
        System.out.println(conta);
    }
}
