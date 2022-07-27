package capgemini_OrObj.exercicio4;

public class Elevador {
    private int andar = 0;
    private int totalAndares;
    private int capacidade;
    private int numeroPessoas = 0;

    public Elevador(int andar, int totalAndares, int capacidade, int numeroPessoas) {
        this.andar = andar;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.numeroPessoas = numeroPessoas;
    }

    public int getAndar() {
        return andar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    //a) Método Inicializa
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    //b) Método Entra
    public int entra(int entrando) {
        if (numeroPessoas + entrando <= capacidade) {
            this.numeroPessoas = numeroPessoas + entrando;
        } else
            System.out.println("O elevador não comporta tantas pessoas.");
        return numeroPessoas;
    }

    //c) Método Sair
    public int sai(int saindo) {
        if (numeroPessoas > 0 && saindo <= numeroPessoas) {
            this.numeroPessoas = numeroPessoas - saindo;
        } else if (numeroPessoas == 0) {
            System.out.println("O elevador já está vazio.");
        } else System.out.println("Não há como mais pessoas saírem do que a quantia total no elevador.");
        return numeroPessoas;
    }

    //d) Método Sobe
    public int sobe(int novoAndar) {
        if (novoAndar <= totalAndares && novoAndar > 0) {
            andar = novoAndar;
        } else if (novoAndar >= totalAndares && andar == totalAndares) {
            System.out.println("Você já está no último andar.");
        } else System.out.println("Algo deu errado, tente novamente.");
        return andar;
    }

    //e) Método Desce
    public int desce(int novoAndar) {
        if (novoAndar >= 0 && novoAndar < totalAndares) {
            this.andar = novoAndar;
        } else if (novoAndar <= 0 && andar == 0) {
            System.out.println("Você já está no térreo.");
        }
        else System.out.println("Algo deu errado, tente novamente.");
        return andar;
    }
}