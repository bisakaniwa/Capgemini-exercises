package capgemini_OrObj.exercicio7;

public class exercicio7 {
    public static void main(String[] args) {

        Funcionarios joaoGomes = new Funcionarios("João", "Gomes", 2000f);
        Funcionarios mariaSilva = new Funcionarios("Maria", "Silva", 2300f);

        System.out.println(joaoGomes.getPrimeiroNome() + " " + joaoGomes.getSobrenome() + ", R$" + joaoGomes.getSalarioMensal());
        System.out.println(mariaSilva.getPrimeiroNome() + " " + mariaSilva.getSobrenome() + ", R$" + mariaSilva.getSalarioMensal());

        float novoJoao = joaoGomes.novoSalario(0.1f, joaoGomes);
        float novoMaria = mariaSilva.novoSalario(0.1f, mariaSilva);
        System.out.println(novoJoao);
        System.out.println(novoMaria);
    }
}
