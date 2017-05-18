package simpleCalc;

import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/17/17.
 */
public class MathematicsTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:  ");
        int num2 = sc.nextInt();

        System.out.println("Enter calculation function():");
        System.out.println("1.  Addition");
        System.out.println("2.  Subtraction");
        System.out.println("3.  Multiplication");
        System.out.println("4.  Division");
        int functionOpt = sc.nextInt();

        Mathematics mathematics = new Mathematics();
        switch (functionOpt) {
            case 1 :
                System.out.println(mathematics.addMethod(num1, num2));
                break;
            case 2 :
                System.out.println(mathematics.subMethod(num1, num2));
                break;
            case 3 :
                System.out.println(mathematics.multMethod(num1, num2));
                break;
            case 4 :
                System.out.println(mathematics.divMethod(num1, num2));
                break;

        }

    }
}
