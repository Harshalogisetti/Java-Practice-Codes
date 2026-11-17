import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate in % (R): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time period in years (T): ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("\n--- Results ---");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);

    }
}
