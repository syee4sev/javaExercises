import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/11/17.
 */
public class stringMethods {
    public static void main(String[] args) {

        String word = "Pinnacles";
        String word2 = "Codeup";
        String sentence = "Programming is great!";
        String sentence2 = "Java is great!";
        String sentence3 = "Programming requries a lot of practice";

//        if(sentence.startsWith("Programming")) {
//            System.out.println("sentence" + " starts with programming");
//        }


        String message = "We don't need no education \nWe don't need no thought control \n\nCheck \"this\" out!, \"s inside of \"s!\n\nIn windows, the main drive is " +
                "usually C:\\\n\nI can do backslashes \\, double backslashes \\\\\nand the amazing triple backslash \\\\\\";
        System.out.println(message);


        String test = "I dont like soda";
        System.out.println(test.replace("soda", "juice"));



    }
}
