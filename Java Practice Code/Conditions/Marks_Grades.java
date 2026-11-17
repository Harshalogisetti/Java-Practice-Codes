import java.util.Scanner;

public class Marks_Grades{
    public static void main(String[] args) {
        System.out.println("Enter Your Marks in Sub1: ");
        System.out.println("Enter Your Marks in Sub2: ");
        System.out.println("Enter Your Marks in Sub3: ");


        Scanner sc = new Scanner(System.in);
        double Sub1 = sc.nextDouble();
        double Sub2 = sc.nextDouble();
        double Sub3 = sc.nextDouble();

        if(Sub1 >= 90){
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is A");
        }else if(Sub1 >= 80){
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is B");
        }else if(Sub1 >= 70){
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is C");
        }else if(Sub1 >= 60){
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is D");
        }else if(Sub1 >= 50){
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is E");
        }else{
            System.out.println("The Grade is Sub1 for marks " +Sub1+" is F:Fail");
        }

        if(Sub2 >= 90){
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is A");
        }else if(Sub2 >= 80){
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is B");
        }else if(Sub2 >= 70){
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is C");
        }else if(Sub2 >= 60){
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is D");
        }else if(Sub2 >= 50){
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is E");
        }else{
            System.out.println("The Grade is Sub2 for marks " +Sub2+" is F:Fail");
        }

        if(Sub3 >= 90){
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is A");
        }else if(Sub3 >= 80){
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is B");
        }else if(Sub3 >= 70){
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is C");
        }else if(Sub3 >= 60){
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is D");
        }else if(Sub3 >= 50){
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is E");
        }else{
            System.out.println("The Grade is Sub3 for marks " +Sub3+" is F:Fail");
        }

    }
}