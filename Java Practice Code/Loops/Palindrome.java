import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long a = sc.nextLong();
        long digit = a;
        long rev = 0;

        while( digit != 0 ){
            long b = digit % 10;
            rev = rev * 10 + b;
            digit /= 10;
        }
        System.out.println("Reversed Number : " + rev);
        if(rev == a){
            System.out.println("The Number You Entered is a Plindrome");
        }else{
            System.out.println("The Number You Entered is not a Plindrome");           
        }
    }
}
