import java.util.Arrays;

public class RotationCount_in_RotationSortedArray {
//    static int count (int[] arr){
//        int[] num = arr.clone();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[0] == num[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//       // int[] arr = {15, 18, 2, 3, 6, 12};
//        int[] arr = {7, 9, 11, 12, 5};
//        System.out.print(count(arr));
//    }

    // OR

    static int findpivot (int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if (mid > start && nums[mid  -1] > nums[mid]){
                return mid - 1;
            }
            if (nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    private static int countRotation(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.print(countRotation(arr));
    }


}
