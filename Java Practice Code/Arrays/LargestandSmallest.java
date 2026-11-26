import java.util.Scanner;

class LargestandSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number of Elements in an Array: ");
        int a = sc.nextInt();
        
        if (a > 0) {
            int arr[] = new int[a];
            System.out.println("Enter Elements in an Array: ");
            
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            
            int largest = arr[0];
            int smallest = arr[0];
            
            for (int i = 1; i < a; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            System.out.println("Largest Element in the Array is: " + largest);
            System.out.println("Smallest Element in the Array is: " + smallest);
        } else {
            System.out.println("Please enter a valid number greater than 0.");
        }
        
        sc.close();
    }
}
