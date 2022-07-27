package capgemini_OrObj.exercicio7;

public class Funcionarios {
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;

    public Funcionarios(String primeiroNome, String sobrenome, float salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float novoSalario(float aumento, Funcionarios funcionarios) {
        return (aumento * salarioMensal) + salarioMensal;
    }
}
