package capgemini_OrObj.exercicio1;

import java.time.LocalDate;

public class exercicio1 {
    public static void main(String[] args) {

        LocalDate nasc = LocalDate.of(1998, 9, 3);
        pessoas pessoa = new pessoas("João", nasc, 1.72f);
        int idade = pessoa.calcularIdade(nasc.getYear());
        System.out.println(pessoa.getDados());
        System.out.println(idade + " anos");
    }
}
