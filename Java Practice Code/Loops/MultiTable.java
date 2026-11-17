import java.util.Scanner;

class MultiTable {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a Number for the Multiplication Table: ");
        int a = sc.nextInt();

        System.out.print("Enter a number until you need a Multplication Table: ");
        int b = sc.nextInt();


        System.out.println("The Multiplication Table for " + a + " till " + b + " is :");
        for(int i = 1; i <= b ; i++ ){
            int c = a * i;
            System.out.println(a + " * " + i + " : " + c);
        }
    }
}
