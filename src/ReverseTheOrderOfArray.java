import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheOrderOfArray {

    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reversed (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap (arr, start , end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the number of elements in Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements in Array: ");
        for (int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        reversed(arr);
        System.out.print("The reversed Array is : " + Arrays.toString(arr));
    }
}
