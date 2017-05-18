package productEntry;

import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/17/17.
 */
public class ProductTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter description: ");
        String description = sc.nextLine();

        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity of items: ");
        double quantity = sc.nextDouble();

        //new Product object
        Product product = new Product(description, price);

        //call product totalPrice to calculate totalPrice
        double totalPrice = product.totalPrice(quantity);

        //print totalPrice
//        System.out.println(totalPrice);

        Receipt receipt = new Receipt();
        receipt.addline(product, quantity);

        System.out.println(receipt.print());

    }


}

