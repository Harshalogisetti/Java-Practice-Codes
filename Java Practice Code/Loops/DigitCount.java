import java.util.Scanner;
class DigitCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long a = sc.nextLong();
        long count = 0;
        long remain = a;

        while (remain != 0 ){
            long b = remain % 10;
            count ++;

            remain /= 10; 
        }
        System.out.println("Digit count: " + count);
    }
}
