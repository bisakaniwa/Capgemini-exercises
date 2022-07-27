package capgemini_OrObj.exercicio5;

public class exercicio5 {
    public static void main(String[] args) {

        Alunos maria = new Alunos("Maria", 1000, 10, 8, 9);
        Alunos joao = new Alunos("João", 1200, 6, 8, 5);


        float mediamaria = maria.media(maria);
        float mediajoao = joao.media(joao);
        System.out.println(mediamaria);
        System.out.println(mediajoao);

        maria.provafinal(9f);
        joao.provafinal(6.4f);

    }
}
