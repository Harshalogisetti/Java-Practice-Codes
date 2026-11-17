import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number:");
        int a = sc.nextInt();
        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number entered is a Prime Number");
        } else {
            System.out.println("The number entered is not a Prime Number");
        }

        // Print Prime Numbers Till N
        System.out.print("Enter a Number to Print prime Numbers till N : ");
        int N = sc.nextInt();

        for (int j = 2; j <= N; j++) {
            boolean isJPrime = true;
            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    isJPrime = false;
                    break;
                }
            }
            if (isJPrime) {
                System.out.println(j);
            }
        }
    }
}
