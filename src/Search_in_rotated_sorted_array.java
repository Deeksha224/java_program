public class Search_in_rotated_sorted_array {
    public static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        if (pivot == -1){
            return binarysearch (nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarysearch (nums, target, 0, pivot - 1);
        }
        if (target < nums[0]){
            return binarysearch (nums, target, pivot + 1, nums.length - 1);
        }
        return -1;
    }
    // This findpivot method does't work for duplicate values
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

    static int findpivot_withDuplicate (int[] nums){
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
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                // skip the duplicate... but first check they must not be pivot
                if (nums[start] > nums[start + 1]){
                    return start;
                }
                start++;
                if (nums[end] > nums[end - 1]){
                    return end;
                }
                end--;
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int binarysearch (int[] nums, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.print(search(nums, target));
    }
}
