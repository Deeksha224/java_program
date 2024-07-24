import java.util.Arrays;
import java.util.Scanner;

public class Conversion_of_string_to_int_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Taking array in the form of string
        String input = in.next(); // [1,2,3]
        // Removing braces
        input = input.substring(1, input.length() - 1);
        //System.out.println(input);
        // removing commas
        String[] arr1 = input.split(","); //1 2 3
        // converting string to int
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            arr[i] = Integer.parseInt(arr1[i].trim());
        }
//   for (int i : arr) {
//    System.out.print(i + " ");
//   }
//   OR
//   for (int i = 0; i < arr1.length; i++){
//    System.out.print(arr[i] + " ");
//   }

        int[] result = new int[arr.length + arr.length];
        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(arr,0,result,arr.length,arr.length);
        System.out.print(Arrays.toString(result));
    }
}
