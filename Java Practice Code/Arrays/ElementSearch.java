import java.util.Scanner;
class ElementSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements in an Array: ");
        int a = sc.nextInt();

        if(a > 0){
            int arr[] = new int[a];

            System.out.println("Enter Elements in an Array: ");
            for(int i = 0; i < a; i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("Elements in the array : ");
            for(int i = 0; i < a; i++){
                System.out.print(arr[i]+ " ");
            }

            System.out.print("\nEnter a Element to Search : ");

            int num = sc.nextInt();
            int index = -1;

            for(int i = 0; i < a; i++){
                if( num == arr[i] ){
                    index = i;
                    break;
                }
            }
            if(index != -1){
                System.out.print("The Index value of the element is : " + index);
            }else{
                System.out.print("Element Index not found");
            }
        }else{
            System.out.println("Please Enter a Valid Number Greater than 0 ");
        }
        sc.close();
    }
}
