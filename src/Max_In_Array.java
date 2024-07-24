import java.util.Scanner;

public class Max_In_Array {

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the Array : ");
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int maximum = max(arr);
        System.out.print("The Maximum number in the given Array is : " + maximum);
    }
}
