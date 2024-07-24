import java.util.Arrays;

public class Search_in_2D_Array {
    static int[] search (int[][] arr , int target){
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int [] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] nums = {{2,3,4,5}, {23,4,13,54,46},{1,13,15,19}};
        int target = 54;
        int[] ans = search(nums, target);
        System.out.print(Arrays.toString(ans));
    }
}
