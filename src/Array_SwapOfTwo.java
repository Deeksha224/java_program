import java.util.Arrays;
import java.util.Scanner;

public class Array_SwapOfTwo {
    static void swap(int [] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int [] arr = new int [n];

        System.out.print("Enter the Array: ");
        for (int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the indexes : ");
        int index1 = in.nextInt();
        int index2 = in.nextInt();

        swap (arr, index1, index2);
        System.out.print(Arrays.toString(arr));
    }
}
