package arrays;

import productEntry.Product;

import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/18/17.
 */
public class ArrayExamples {

    public static void main(String[] args) {

        double[] prices;   //variable declaration
        prices = new double[4]; //initialize and specify the size of array

        String[] names;
        names = new String[4];

        boolean[] apples;
        apples = new boolean[10];

        //int[] apples = new int[20];  declaration + initialization

//==================================================

        System.out.println(apples[4]);

        prices[0] = 12.5;
        System.out.println(prices[0]);
        System.out.println(prices[3]);

        names[1] = "everardo";
        System.out.println(names[1]);
        System.out.println(names[2]);





        //====== intitailize with console input
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements in this array:  ");

        int size = sc.nextInt();

        int[] elements = new int[size];
        System.out.println();


        //=======enumerate the elements of the array on creation
        String[] beatles = {"John", "Paul", "George", "Ringo"};
        System.out.println(beatles[2]);

        //========= different array declaration
        String[] beatlesCopy = new String[4];
        beatlesCopy[0] = "john";
        beatlesCopy[1] = "Paul";
        beatlesCopy[2] = "George";
        beatlesCopy[3] = "Ringo";


        Product[] products = new Product[10];
        products[0] = new Product("Mango", 2.5);


        Product[] myBasket = {
                new Product("Mango", 2.5),
                new Product("Coke", 1.5)
        };
        System.out.println(myBasket[0].format()); // method available since basket is an object

    }

}
