import java.util.Scanner;
class SortingArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");

        int a = sc.nextInt();

        if(a > 0){
            int arr[] = new int[a];

            System.out.println("Enter the Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("\nThe Elements in the Array: ");
            for(int i = 0; i < a; i++){
                System.out.print(arr[i]+ " ");
            }
            for(int i = 0; i < a; i++){
                for(int j = i + 1; j < a; j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.print("\nThe Sorted Array is : " );
            for(int i = 0; i < a; i++){
                System.out.print(arr[i] + " ");
            }
        }else{
            System.out.println("Please Enter a Valid Number greater than 0");
        }
    }
}