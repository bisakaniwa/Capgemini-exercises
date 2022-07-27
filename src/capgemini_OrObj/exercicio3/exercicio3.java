package capgemini_OrObj.exercicio3;

public class exercicio3 {
    public static void main(String[] args) {
        BombaCombustivel shell = new BombaCombustivel("Álcool", 5.5f, 300f);

        //a) abastecerPorValor
        System.out.println(shell.abastecerPorValor(55));

        //b) abastecerPorLitro
        System.out.println(shell.abastecerPorLitro(10));

        //c) alterarValor
        shell.alterarValor(6.0f);
        System.out.println(shell.getValorLitro());

        //d) alterarCombustivel
        shell.alterarCombustivel("Gasolina Aditivada");
        System.out.println(shell.getTipoDeCombustivel());

        //e) alterarQuantidadeCombustivel
        shell.alterarQuantidadeCombustivel(200);
        System.out.println(shell.getQuantidadeCombustivel());
    }
}
