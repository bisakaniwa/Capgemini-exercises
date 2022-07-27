package capgemini_OrObj.exercicio3;

public class BombaCombustivel {
    private String tipoDeCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public BombaCombustivel(String tipoDeCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    //a) abastecerPorValor
    public float abastecerPorValor(float valorAbastecimento) {
        return valorAbastecimento / valorLitro;
    }
    //b) abastecerPorLitro
    public float abastecerPorLitro(float quantidadeLitros) {
        return quantidadeLitros * valorLitro;
    }
    //c) alterarValor
    public void alterarValor(float novoValor) {
        this.valorLitro = novoValor;
    }
    public float getValorLitro() {
        return valorLitro;
    }

    //d) alterarCombustivel
    public void alterarCombustivel(String novoCombustivel) {
        this.tipoDeCombustivel = novoCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    //e) alterarQuantidadeCombustivel
    public void alterarQuantidadeCombustivel(float novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }
}
