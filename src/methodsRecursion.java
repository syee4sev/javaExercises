import sun.security.jca.GetInstance;

import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/11/17.
 */
public class methodsRecursion {
    public static void main(String[] args) {

//        int num1 = 5;
//        int num2 = 2;
//        int result = 0;
//
//        result = addition(num1, num2);
//        System.out.println("The addition of       " + num1 + " + " + num2 + " is " + result);
//
//        result = subtraction(num1, num2);
//        System.out.println("The subtraction of    " + num1 + " - " + num2 + " is " + result);
//
//        result = multiplication(num1, num2);
//        System.out.println("The multiplication of " + num1 + " * " + num2 + " is " + result);
//
//        if (num2 != 0) {
//            float resultF = division(num1, num2);
//            System.out.println("The division of       " + num1 + " / " + num2 + " is " + resultF);
//        } else {
//            System.out.println("Can't divide by 0!");
//        }
//
//        if (num2 != 0) {
//            result = modulus(num1, num2);
//            System.out.println("The modulus of        " + num1 + " % " + num2 + " is " + result);
//        } else {
//            System.out.println("Can't divide by 0!");
//        }
//    } // end of main method
//
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    };
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    };
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    };
//
//    public static float division(float num1, float num2) {
//        return num1 / num2;
//        };
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    };
//    public static void msg() {
//        System.out.println("Can't divide by 0!");
//    }


//       Scanner sc = new Scanner(System.in);
//       float result;
//
//        System.out.println("Enter the first number:  ");
//        float num1 = sc.nextInt();
//
//        System.out.println("Enter the second number:  ");
//        float num2 = sc.nextInt();
//
//        result = addition(num1, num2);
//        System.out.println("The addition of       " + num1 + " + " + num2 + " is " + result);
//
//        result = subtraction(num1, num2);
//        System.out.println("The subtraction of    " + num1 + " - " + num2 + " is " + result);
//
//        result = multiplication(num1, num2);
//        System.out.println("The multiplication of " + num1 + " * " + num2 + " is " + result);
//
//        if (num2 != 0) {
//            float resultF = division(num1, num2);
//            System.out.println("The division of       " + num1 + " / " + num2 + " is " + resultF);
//        } else {
//            System.out.println("Can't divide by 0!");
//        }
//
//        if (num2 != 0) {
//            result = modulus(num1, num2);
//            System.out.println("The modulus of        " + num1 + " % " + num2 + " is " + result);
//        } else {
//            System.out.println("Can't divide by 0!");
//        }
//    } // end of main method
//
//    public static float addition(float num1, float num2) {
//        return num1 + num2;
//    };
//
//    public static float subtraction(float num1, float num2) {
//        return num1 - num2;
//    };
//
//    public static float multiplication(float num1, float num2) {
//        return num1 * num2;
//    };
//
//    public static float division(float num1, float num2) {
//        return num1 / num2;
//        };
//    public static float modulus(float num1, float num2) {
//        return num1 % num2;
//    };
//    public static void msg() {
//        System.out.println("Can't divide by 0!");
//    }


//        float result;
//        float num2 = 0;
//        float num1 = 0;
//
//        num1 = askNum1(num1);
//        num2 = askNum2(num2);
//
//        if(getInteger(num1, num2)){
//            System.out.println("One of the numbers is out of range!");
//            main(args);
//
//        } else {
//
//            result = addition(num1, num2);
//            System.out.println("The addition of       " + num1 + " + " + num2 + " is " + result);
//
//            result = subtraction(num1, num2);
//            System.out.println("The subtraction of    " + num1 + " - " + num2 + " is " + result);
//
//            result = multiplication(num1, num2);
//            System.out.println("The multiplication of " + num1 + " * " + num2 + " is " + result);
//
//            if (num2 != 0) {
//                float resultF = division(num1, num2);
//                System.out.println("The division of       " + num1 + " / " + num2 + " is " + resultF);
//            } else {
//                System.out.println("Can't divide by 0!");
//            }
//
//            if (num2 != 0) {
//                result = modulus(num1, num2);
//                System.out.println("The modulus of        " + num1 + " % " + num2 + " is " + result);
//            } else {
//                System.out.println("Can't divide by 0!");
//            }
//
//        }
//    } // end of main method
//
//    public static float askNum1(float num1) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number between 1 and 10:  ");
//        num1 = sc.nextInt();
//        return num1;
//    };
//    public static float askNum2(float num2) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the second number between 1 and 10:  ");
//        num2 = sc.nextInt();
//        return num2;
//    };
//
//    public static float addition(float num1, float num2) {
//        return num1 + num2;
//    };
//
//    public static float subtraction(float num1, float num2) {
//        return num1 - num2;
//    };
//
//    public static float multiplication(float num1, float num2) {
//        return num1 * num2;
//    };
//
//    public static float division(float num1, float num2) {
//        return num1 / num2;
//    };
//    public static float modulus(float num1, float num2) {
//        return num1 % num2;
//    };
//    public static void msg() {
//        System.out.println("Can't divide by 0!");
//    }
//
//    public static boolean getInteger(float num1, float num2){
//    if((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)) {
//        return true;
//    } else {
//        return false;
//    }
//
//    };


        // factorial


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number betwween 1 and 10:  ");
        int num1 = sc.nextInt();


        if (checkNum(num1)) {
            System.out.println("Please enter a valid number");
            main(args);
        } else {
            int total = getFactorial(num1);
        }
    }


    public static int getFactorial(int num1) {

        int total = num1;

        for (int i = num1; i > 1; i--) {
            total = total * (i - 1);

        }
        System.out.println(num1 + "!" + " is:  " + total);
        return total;
    }

    public static boolean checkNum(int num1) {
        if (num1 < 1 || num1 > 10) {
            return true;
        } else
            return false;
    }


}
