import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Find the largest of two numbers
        System.out.println("Largest of Two Numbers");
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("The largest number is: " + a);
        } else if (b > a) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Part 2: Find the largest of three numbers
        System.out.println("Largest of Three Numbers");
        System.out.print("Enter the first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double z = sc.nextDouble();

        if (x >= y && x >= z) {
            System.out.println("The largest number is: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("The largest number is: " + y);
        } else {
            System.out.println("The largest number is: " + z);
        }

    }
}
