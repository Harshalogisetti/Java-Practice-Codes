import java.util.Scanner;
class SecondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size the of an Array: ");
        int a = sc.nextInt();

        if( a > 0 ){
            int arr[] = new int[a];

            System.out.println("Enter the Elements in an Array: ");
            for(int i = 0; i < a; i++){
                  arr[i] = sc.nextInt();
            }
            int largest = arr[0];
            
            for (int i = 1; i < a; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            int Second_largest = 0;

            for(int i = 0; i < a; i++){
                if(arr[i] != largest){
                    if(arr[i] > Second_largest){
                        Second_largest = arr[i];
                    }
                }
            }
            System.out.println("The Second Largest Number in an Array is: " + Second_largest);
        }else{
            System.out.println("Please Enter A valid Number greater than 0: ");
        }
        sc.close();
    }
}