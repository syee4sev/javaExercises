package arrays;

import java.util.Arrays;

/**
 * Created by everardosifuentes on 5/18/17.
 */
public class ArraysExample {
    public static void main(String[] args) {

        int[] prices = new int[10];

        for(int price : prices){
            System.out.println(price);
        }

        Arrays.fill(prices, 5);
        for(int price : prices){
            System.out.println(price);
        }

        //content is the same so memory plays a role ... almost like String but they point to different memory references
        int[] threeNumbers = {1,2,3};
        int[] sameThreeNumbers = {1,2,3};
        System.out.println(threeNumbers == sameThreeNumbers);
        System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers));

        // need the array name and the length of the array
        int[] thirdcopy = Arrays.copyOf(threeNumbers, threeNumbers.length);
        System.out.println(thirdcopy    );


        int[] moreNumbers = {2,56,7,34,20,45,67};
        int index = Arrays.binarySearch(moreNumbers, 34);
        System.out.println("34 is at index " + index);



    }

}
