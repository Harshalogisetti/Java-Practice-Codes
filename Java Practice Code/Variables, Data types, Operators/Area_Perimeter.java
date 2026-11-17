import java.util.Scanner;

public class Area_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double breadth = sc.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);
        double circleArea = 3.14 * radius * radius ;

        System.out.println("--- Results ---");
        System.out.println("Area of Rectangle: " + rectArea);
        System.out.println("Perimeter of Rectangle: " + rectPerimeter);
        System.out.println("Area of Circle: " + circleArea);

    }
}
