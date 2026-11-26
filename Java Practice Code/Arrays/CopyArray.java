import java.util.Scanner;
class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements in an Array: ");
        int a = sc.nextInt();

        if( a > 0 ){
            int arr1[] = new int[a];

            System.out.println("Enter Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr1[i] = sc.nextInt();
            }

            System.out.print("The Elements in the Array is: ");
            for(int i = 0; i < a; i++){
            System.out.print(arr1[i] + " ");
            }
            
            int arr2[] = new int[a];

            System.out.print("\nCopied Array: ");
            for(int i = 0; i < a; i++){
                arr2[i] = arr1[i];
                System.out.print(arr2[i] + " ");
            }

        }else {
            System.out.println("Please enter a valid number greater than 0.");
        }
        sc.close();
    }
}
