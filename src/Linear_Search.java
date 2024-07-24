public class Linear_Search {
    static int linearsrh(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){ // if element is found
            if (arr[i] == target){
                return i;
            }
        }
        return -1; // if element does't exist in the array
    }

    public static void main(String[] args) {
        int[] nums = {23, 27, 93, -12, 0, -5};
        int target = 0;
        int ans = linearsrh(nums, target);
        System.out.println(ans);
    }
}
