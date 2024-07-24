public class Infinite_Array {
    static int ans (int[] nums, int target){
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return search(nums, target,start,end);
    }
    static int search(int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 14, 17, 27, 30, 32, 36, 40};
        int target = 14;
        System.out.print(ans(nums, target));
    }
}
