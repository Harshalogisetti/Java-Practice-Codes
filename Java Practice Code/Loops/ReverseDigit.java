import java.util.Scanner;
class ReverseDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long a = sc.nextLong();
        System.out.print("Entered Digit : " +a);
        long reversed = 0;

        while(a != 0){
            long b = a % 10;
            reversed = reversed * 10 + b;
            a /= 10;
        }
        System.out.print("\nReversed Digit : " +reversed);
    }
}
