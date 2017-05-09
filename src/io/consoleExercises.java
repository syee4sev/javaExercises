package io;

import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/8/17.
 */
public class consoleExercises {
    public static void main(String[] args) {

        // instantiate the Scanner class
        Scanner sc = new Scanner(System.in);

        // enter integer and display
//            System.out.println("Enter any integer: ");
//            int num1 = sc.nextInt();
//            System.out.println("Your value entered is: " + num1);

        // enter three words and display
//            System.out.println("Enter any three words(be nice): ");
//            String word1 = sc.nextLine();
//            String word2 = sc.nextLine();
//            String word3 = sc.nextLine();
//            System.out.println("Your three words are: " + word1 + " " + word2 + " " + word3);

        // enter a single sentence - next() will only return what's before the first space
//            System.out.println("Enter a single sentence: ");
//            String sent = sc.nextLine();
//            System.out.println("Your sentence is " + sent );

        // perimeter and area of codeup room
        System.out.println("Please enter the length of the room:  ");
        String length = sc.nextLine();
        System.out.println("Please enter the width of the room:  ");
        String width = sc.nextLine();


        int area = Integer.parseInt(length) * Integer.parseInt(width);
        System.out.println("The area of the room is:  " + area);

        int perimeter = (2 * Integer.parseInt(length)) + (2 * Integer.parseInt(width));
        System.out.println("The perimeter of the room is:  " + perimeter);


    }
}
