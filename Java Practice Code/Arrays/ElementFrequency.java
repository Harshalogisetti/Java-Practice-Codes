import java.util.Scanner;

class ElementFrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int a = sc.nextInt();

        if (a > 0) {
            int arr[] = new int[a];
            boolean visited[] = new boolean[a];

            System.out.println("Enter the elements in the Array: ");
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("\nElement | Frequency");
            for(int i = 0; i < a; i++){
                if(visited[i]){
                    continue;
                }
                int count = 1;
                for(int j = i + 1; j < a; j++){
                    if(arr[i] == arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("   " + arr[i] + "  |  " + count);
            }
        } else {
            System.out.println("Please enter a valid number greater than 0.");
        }
        sc.close();
    }
}
