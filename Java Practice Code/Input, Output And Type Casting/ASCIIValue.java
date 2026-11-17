import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        System.out.println("Enter an ASCII number (0 to 127): ");
        int num = sc.nextInt();
        char convertedChar = (char) num;
        System.out.println("The character for ASCII value " + num + " is: '" + convertedChar + "'");

    }
}
