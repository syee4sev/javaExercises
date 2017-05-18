package OOprogramming;
import java.util.Scanner;

/**
 * Created by everardosifuentes on 5/17/17.
 */

    public class Input {


        private Scanner scan;


    public Input(){
        this.scan = new Scanner(System.in);
    }


    public String getString(){
        return scan.nextLine();
    }


    public boolean yesNo(){
        String answer = this.getString();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }


    public int getInt(){
        return scan.nextInt();

    }


    public int getInt(int min, int max){
        int num = this.getInt(); // so we don't have to call the scanner over and over

    if(num >= min && num <= max){
        return num;
        }
        System.out.println(num + " Number out of range, try again!");
        return getInt(min, max);
    }



    public double getDouble(){
        return scan.nextDouble();
    }
    public double getDouble(double min, double max){
        double num = this.getDouble();                 //feed in the get double function

        if(num>= min  && num <=max) {
            return num;
        }
        System.out.println( "return Num out of range");
        return getDouble(min,max);
    }




}
