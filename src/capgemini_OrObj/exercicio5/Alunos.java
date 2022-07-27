package capgemini_OrObj.exercicio5;

public class Alunos {
    private String nome;
    private int matricula;
    private float prova1;
    private float prova2;
    private float trabalho;

    public Alunos(String nome, int matricula, float prova1, float prova2, float trabalho) {
        this.nome = nome;
        this.matricula = matricula;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getProva1() {
        return prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    //a) Método Média
    public float media (Alunos aluno) {
        return ((2.5f * aluno.getProva1()) + (2.5f * aluno.getProva2()) + (2f * aluno.getTrabalho())) / 7f;
    }

    //b) Método Final
    public float provafinal (float media) {
        float provafinal = 10f - media;
        if (media >= 7) {
            System.out.println(nome + " precisa de zero pontos!");
        } else System.out.println(nome + " precisa de " + provafinal + " pontos!");
        return provafinal;
    }
}
