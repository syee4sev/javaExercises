package productEntry;


/**
 * Created by everardosifuentes on 5/17/17.
 */
public class Product {

    //package visibility
    //public for all classes in ths package(folder)
    //object have state

    private String description;
    private double price;


    //constructor, these two parms are coming from outside
    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public double totalPrice(double quantity) {
        return price * quantity;

    }

    public String format() {
        return  String.format("%s $%.2f", description, price);
    }



}


