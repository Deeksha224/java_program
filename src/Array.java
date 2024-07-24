import java.util.Scanner;

public class Array {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of elements you want to enter : ");
            int n = in.nextInt();
            // Initialization of Array
            int[] arr = new int[10];
            // Taking Input
            for (int i = 0; i < n; i++){
                arr[i] = in.nextInt();
            }
            // For Output
            for (int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }

        }
    }

