import javax.swing.*;
import java.util.Arrays;

public class BS_in_sorted_2D_Array {
    // Search in row provided between the cols provided.
    static int[] binarySearch (int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if (matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else {
                cEnd = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] search (int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious as array may be empty.

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        // Run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) { // while is true, then array must have more then 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target){
                    return new int[] {mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        // Now we have two rows
        // Check whether the target is in the dol of 2 row
         if (matrix[rStart][cMid] == target){
             return new int[] {rStart, cMid};
         }
         if (matrix[rStart + 1][cMid] == target){
             return new int[] {rStart + 1, cMid};
         }
         // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid+ 1, cols - 1, target);

        }
        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // Search in 4th half
        else{
            return binarySearch(matrix, rStart + 1, cMid+ 1, cols - 1, target);

        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print(Arrays.toString(search(arr,6)));
    }
}
