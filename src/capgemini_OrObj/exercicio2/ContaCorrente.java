package capgemini_OrObj.exercicio2;

public class ContaCorrente {

    //Atributos

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta=" + numeroConta +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", saldoConta=" + saldoConta +
                '}';
    }

    private int numeroConta;
    private String nomeUsuario;
    private float saldoConta;

    //Construtor

    public ContaCorrente(int numeroConta, String nomeUsuario, float saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeUsuario = nomeUsuario;
        this.saldoConta = saldoConta;
    }

    //Métodos

    public void alterarNome(String abacaxi) {
       this.nomeUsuario = abacaxi;
    }
    public void deposito(float valor) {
        this.saldoConta = saldoConta + valor;
    }
    public void saque(float saque) {
        this.saldoConta = saldoConta - saque;
    }
}
