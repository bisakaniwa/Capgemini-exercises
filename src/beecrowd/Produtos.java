package beecrowd;

public class Produtos {

    private int code;
    protected int units;
    protected float price;

    public void setCode(int code) {
        this.code = code;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Produtos(int code, int units, float price) {
        this.code = code;
        this.units = units;
        this.price = price;
    }

    public void Produtos(int code, int units, float price) {

    }

    public float valorAPagar(int numberUnits) {
        return numberUnits * price;
    }

}
