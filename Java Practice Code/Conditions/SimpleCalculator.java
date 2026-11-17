import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter a Another Number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter a Operator('=','-','*','/'): ");
        char opp = sc.next().charAt(0);

         if (opp == '+'){
            System.out.println("The addition of " + num1 + " and " + num2 + "is : " + (num1+num2));
        }else if (opp == '-') {
            System.out.println("The Subtraction of " + num1 + " and " + num2 + "is : "  + (num1 - num2));
        }else if(opp == '*'){
            System.out.println("The Multiplication of " + num1 + " and " + num2 + "is : "  + (num1 * num2));
        }else if(opp == '/'){
            if(num2 == 0){
                System.out.println("Error: Division by Zero is Not Allowed");
            }else{
            System.out.println("The Division of " + num1 + " and " + num2 + "is : "  + (num1 / num2));
            }
        }else{
            System.out.println("Invalid Operations");
        }
    }
}
