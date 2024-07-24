public class Agnostic_Binary_search {
    static int agnosticbs(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        boolean isAsc = nums[start] < nums[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (isAsc){
                if (nums[mid] > target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (nums[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr = {-12, -2, 3, 4, 56};
        int[] arr = {56, 45, 31, 10, 3, -12,};
        int target = 3;
        int ans = agnosticbs(arr, target);
        System.out.print(ans);
    }
}
