import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long a = sc.nextLong();

        long sum = 0;

        long b = Math.abs(a);

        while( b > 0 ){
            long c = b % 10;
            sum += c;

            b /= 10;
        }
        System.out.println("Sum of Digits :" + sum);

        sc.close();
    }
}
