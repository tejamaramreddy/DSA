package arrays.slidingwindow;

public class MaxConsecutiveOnesIII {
    public static int longestOnes(int[] nums, int k) {
        if (k >= nums.length) {
            return nums.length;
        }
        int left = 0;
        int num_zeros = 0;
        int max_len = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0){
                num_zeros++;
            }
            while (num_zeros>k){
               if(nums[left] == 0){
                   num_zeros--;
               }
               left++;
            }
            max_len = Math.max(max_len, right - left + 1);
        }
        return max_len;
    }
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,0,0,1,1,1,0}, 2));
    }
}
