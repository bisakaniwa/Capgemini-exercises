package capgemini_OrObj.exercicio6;

public class Invoice {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private float precoUnitario;

    public Invoice(int numeroItem, String descricaoItem, int quantidadeComprada, float precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getInvoiceAmount(Invoice invoice) {
        return invoice.getQuantidadeComprada() * invoice.getPrecoUnitario();
    }
}
