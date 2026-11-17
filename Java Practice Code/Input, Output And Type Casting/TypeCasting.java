import java.util.Scanner;

public class TypeCasting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Implicit Type casting
        System.out.println("Enter a Number in Int: ");
        int num1 = sc.nextInt();
        
        double num2 = num1;

        System.out.println("Int to Double: " + num2);
        
        //Explicit Type casting
        System.out.println("Enter a Number in double: ");
        double num3 = sc.nextDouble();
        
        int num4 = (int) num3;

        System.out.println("Int to Double: " + num4);
    }
}

