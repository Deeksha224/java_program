import java.util.Arrays;
import java.util.Scanner;

public class Concat_of_array {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        int[] result = new int[arr.length + arr.length];

//        for (int i = 0; i < arr.length; i++){
//            result[i] = arr[i];
//        }
//
//        for (int i = 0; i < arr.length; i++){
//            result[i + arr.length] = arr[i];
//        }

//        OR

        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(arr,0,result,arr.length,arr.length);
        System.out.print(Arrays.toString(result));
    }
}
