import java.util.Scanner;

class NumbersPrint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int N = sc.nextInt();

        System.out.println("The digits from 1 to N: ");

        for(int i = 1; i <= N ; i++){
            System.out.println(i);
        }

        //Only Even Numbers:
        System.out.print("\nEnter a Number: ");
        int M = sc.nextInt();

        System.out.println("The Even digit from 1 to M :");
        for(int j = 1; j <= M; j++){
            if(j%2 == 0){
                System.out.println(j);
            }
        }

        //Numbers in Reverse
        System.out.print("\nEnter a Number: ");
        int L = sc.nextInt();

        System.out.println("The Number in Reverse from L to 1 : ");
        for(int k = L; k >= 1; k-- ){
            System.out.println(k);
        }
    }
}

