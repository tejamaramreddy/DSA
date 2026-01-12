package arrays.binarysearch;

public class FindPeak {
    public static int peakIndex(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(peakIndex(new int[]{1,2,3,1}));
    }
}
