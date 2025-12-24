package arrays;

public class MinimumSumSubArray {
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE;
        for(int item : nums){
            currentSum = Math.min(item, currentSum + item);
            minSum = Math.min(minSum, currentSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,-1,-5,4}));
    }
}
