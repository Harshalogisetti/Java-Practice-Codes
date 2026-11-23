import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.print("Enter the number of terms (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(firstTerm + " ");

                long nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

        sc.close();
    }
}
