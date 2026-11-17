import java.util.Scanner;
public class LastDigit {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int lastDigit = number % 10;

        int remainingNumber = number / 10;

        System.out.println("Original Number: " + number);
        System.out.println("Last Digit: " + lastDigit);
        System.out.println("Number without last digit: " + remainingNumber);
    }
}
