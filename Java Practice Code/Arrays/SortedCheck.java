import java.util.Scanner;

class SortingArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int a = sc.nextInt();

        if (a > 0) {
            int arr[] = new int[a];

            System.out.println("Enter the elements in an Array: ");
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Elements in an Array: ");
            for (int i = 0; i < a; i++) {
                System.out.print(arr[i] + " ");
            }

            boolean isSorted = true;
            for (int i = 1; i < a; i++) {
                if (arr[i] < arr[i - 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                System.out.println("\nThe Array is Sorted");
            } else {
                System.out.println("\nThe Array is Not Sorted");
            }
        }else{
            System.out.println("\nPlease Enter a Valid Number greater than 0 : ");
        }
        sc.close();
    }
}
