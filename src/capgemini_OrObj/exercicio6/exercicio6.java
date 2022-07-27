package capgemini_OrObj.exercicio6;

public class exercicio6 {
    public static void main(String args) {

        Invoice mousepad = new Invoice(4362, "mousepad", 2, 5.5f);
        System.out.println(mousepad.getInvoiceAmount(mousepad));
    }
}
