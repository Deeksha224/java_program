public class Binary_search {
    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if (arr[mid] < target ){
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-12, -8, -2, 0, 5, 10, 22, 35, 67, 90};
        int target = 10;
        int ans = binarysearch(arr, target);
        System.out.print(ans);
    }
}
