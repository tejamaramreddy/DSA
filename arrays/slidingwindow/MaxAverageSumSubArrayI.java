package arrays.slidingwindow;

public class MaxAverageSumSubArrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for(int i =k; i < nums.length; i++){
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage( new int[]{2,3,1,2,4,3}, 4));
    }
}
