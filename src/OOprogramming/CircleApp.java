package OOprogramming;

/**
 * Created by everardosifuentes on 5/17/17.
 */
public class CircleApp {

    public static void main(String[] args) {
        Input entry = new Input();

        System.out.println("Enter a radius:  ");
        double radius = entry.getDouble();

        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
