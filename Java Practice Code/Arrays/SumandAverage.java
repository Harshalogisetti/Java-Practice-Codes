import java.util.Scanner;
class SumandAverage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements in an Arrays: ");
        int a = sc.nextInt();
        int sum = 0;

        if(a > 0){
            int arr[] = new int[a];

            System.out.println("Enter Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < a; i++){
                sum += arr[i];
            }
            System.out.print("Sum of Elements in an Array is: " + sum);

            double Avg = (double) sum/a;

            System.out.print("\nAvg of Elements in an Array is: " + Avg);
        }else{
            System.out.println("Please Enter A valid number greater than 0");
        }
        sc.close();
    }
}
