package productEntry;

/**
 * Created by everardosifuentes on 5/17/17.
 */
public class Receipt {

    private String lines;
    private double total;


    public Receipt() {
        lines = "";
        total = 0;
    }


    public void addline(Product product, double quantity) {
        double productTotal = product.totalPrice(quantity);

        String receiptLine = String.format(
                "%s %.0f $%.2f\n",
                product.format(), quantity, productTotal);

        lines += receiptLine;
        total += productTotal;
    }

    public String print() {
        return String.format("%sTotal is: $%.2f", lines, total);
    }




}
