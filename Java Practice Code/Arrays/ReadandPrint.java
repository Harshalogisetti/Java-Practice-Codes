import java.util.Scanner;
class ReadandPrint {
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
        }else {
            System.out.println("Please enter a valid number greater than 0.");
        }
        sc.close();
    }
}
