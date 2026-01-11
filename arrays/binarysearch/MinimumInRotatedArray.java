package arrays.binarysearch;

public class MinimumInRotatedArray {
    public static int findMin(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < min){
                min = nums[mid];
            }
            if(nums[mid] < nums[end]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1,2,3,4,5,6,7,8,9,-1}));
    }
}
