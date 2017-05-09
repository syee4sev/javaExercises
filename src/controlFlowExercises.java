/**
 * Created by everardosifuentes on 5/9/17.
 */
public class controlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15) {
//            System.out.println("The value of i is: " + i);
//            i++;
//        }


//        int i = 2;
//        do {
//            System.out.println("the numbers are: " + i);
//            i = i + 2;
//        } while (i<=100);


//          int i = 100;
//          do {
//            System.out.println("the numbers are: " + i);
//            i = i - 5;
//          } while (i >= -10);


//            int i = 2;
//            do {
//                System.out.println("the numbers are: " + i);
//                i = i * 2;
//            } while (i<=100000);


for(int i = 1; i <= 100; i++) {

    if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (i % 3 == 0) {
        System.out.println("Fizz");
    } else if (i % 5 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(i);
    }

}


    } // end main

}
