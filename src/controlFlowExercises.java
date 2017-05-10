import java.util.Scanner;

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


//        long i = 2;
//        do {
//            System.out.println("the numbers are: " + i);
//            i = i * i;
//        } while (i <= 100000);


//for(int i = 1; i <= 100; i++) {
//
//    if (i % 3 == 0 && i % 5 == 0) {
//        System.out.println("FizzBuzz");
//    } else if (i % 3 == 0) {
//        System.out.println("Fizz");
//    } else if (i % 5 == 0) {
//        System.out.println("Buzz");
//    } else {
//        System.out.println(i);
//    }
//
//}


//        String yesNo;
//        Scanner sc = new Scanner(System.in);
//
//
//        do {
//            System.out.println("What number would you like to go up to:  ");
//
//            int num = sc.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number    |    squared    |    cubed");
//            System.out.println("------    |    -------    |    -----");
//
//            for (int i = 1; i <= num; i++) {
//                System.out.println("   " + i + "      |      " + square(i) + "        |     " + cube(i));
//            }
//
//            sc.nextLine();
//            System.out.println("Would you like to continue:  ");
//            yesNo = sc.nextLine();
//
//        }while (yesNo.equalsIgnoreCase("Y"));
//
//    } // end main
//
//    public static int square(int num)
//    {
//        int sNum = num * num;
//        return sNum;
//
//    }
//
//    public static int cube(int num)
//    {
//        int cNum = num * num * num;
//        return cNum;
//
//    }




        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your grade:  ");
        int grade = sc.nextInt();

      if ((grade >= 88) && (grade <= 100)) {
          System.out.println("A");
      } else if
            ((grade >= 80) && (grade <= 87)) {
            System.out.println("B");
      } else if
            ((grade >= 67) && (grade <= 79)) {
            System.out.println("C");
      } else if
            ((grade >= 60) && (grade <= 66)) {
            System.out.println("D");
      } else {
//        ((grade >= 0) && (grade <= 59))
            System.out.println("F");
        }


    }

}
