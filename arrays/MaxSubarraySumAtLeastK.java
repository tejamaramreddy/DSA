package arrays;

public class MaxSubarraySumAtLeastK {

    public static int maxSubarraySumAtLeastK(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Kadane array
        int[] maxEndingHere = new int[n];
        maxEndingHere[0] = nums[0];

        for (int i = 1; i < n; i++) {
            maxEndingHere[i] = Math.max(nums[i], maxEndingHere[i - 1] + nums[i]);
        }

        // Step 2: Sliding window of size K
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 3: Slide the window
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];

            // Extend window to the left if beneficial
            int currentMax = windowSum + Math.max(0, maxEndingHere[i - k]);
            maxSum = Math.max(maxSum, currentMax);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySumAtLeastK(new int[]{1, 2, -5, 4, 6}, 2));
    }
    }


