import java.util.Scanner;
class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int a = sc.nextInt();

        if(a > 0){
            int arr[] = new int[a];

            System.out.println("Enter the Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr[i] = sc.nextInt();
            }

            int start = 0;
            int end = a - 1;

            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
            System.out.println("Reversed array : ");
            for(int i = 0; i < a; i++){
                System.out.print(arr[i] + "  ");
            }
        }else{
            System.out.println("Please enter a valid number greater than 0.");
        }
        sc.close();
    }
}
