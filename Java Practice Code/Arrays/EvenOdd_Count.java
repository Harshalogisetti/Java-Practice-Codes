import java.util.Scanner;
class EvenOdd_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in an Array: ");
        int a = sc.nextInt();

        if( a > 0 ){ 
            int arr[] = new int[a];

            System.out.println("Enter Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("The Elements in the Array is: ");
            for(int i = 0; i < a; i++){
            System.out.print(arr[i] + " ");
            }

            int Evencount = 0;
            int Oddcount = 0;

            for(int i = 0; i < a; i++){
                if(arr[i] % 2 == 0){
                    Evencount++;
                }else{
                    Oddcount++;
                }
            }
            System.out.println("The number Even elements in an Array is : " +Evencount);
            System.out.println("The number Odd elements in an Array is : " +Oddcount);
        }else{
            System.out.println("Please enter a valid number greater than 0.");
        }
        sc.close();
    }
}