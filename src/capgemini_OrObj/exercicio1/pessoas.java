package capgemini_OrObj.exercicio1;

import java.time.LocalDate;
import java.util.Date;

public class pessoas {

    //Atributos

    private String nome;
    private LocalDate nascimento;
    private float altura;

    //Construtor
    public pessoas(String primeiroNome, LocalDate dataNascimento, float alturaMetros) {
        nome = primeiroNome;
        nascimento = dataNascimento;
        altura = alturaMetros;
    }

    //Setters & getters

    public void setnome() {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setnascimento() {
        this.nascimento = nascimento;
    }

    public LocalDate getnascimento() {
        return nascimento;
    }

    public void setaltura() {
        this.altura = altura;
    }

    public float getaltura() {
        return altura;
    }

    //Métodos

    public String getDados() {
        String dados = nome + " " + nascimento + " " + altura + " ";
        return dados;
    }
    public int calcularIdade(int ano) {
        LocalDate anoAtual = LocalDate.now().minusYears(ano);
        return anoAtual.getYear();
    }
}
