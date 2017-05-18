package arrays;

/**
 * Created by everardosifuentes on 5/18/17.
 */
public class ArrayIteration {
    public static void main(String[] args) {


        String[] languages = {"HTML", "CSS", "Javascript", "Java"};

        System.out.println("I know the following languages: ");
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }


        int[] numbers = {2, 12, 23, 40, 78, 100};
        int sum=0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("the sum of the numbers is " + sum);



        //enhanced for loop .. language is new var ..
        //for each language in languages do(how to read the enhanced loop
        for(String language : languages){
            System.out.println(language);
        }

        sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("the sum of numbers using enhanced for: " + sum);


    }
}
