package arrays.slidingwindow;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        int win_sum = 0;
        for (int right = 0; right < nums.length; right++) {
            win_sum = win_sum + nums[right];
            while (win_sum >= target){
                min_len = Math.min(min_len, right - left + 1);
                win_sum = win_sum - nums[left];
                left++;
            }
        }
        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
