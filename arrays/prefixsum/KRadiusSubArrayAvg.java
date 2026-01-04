package arrays.prefixsum;

import java.util.Arrays;

public class KRadiusSubArrayAvg {
    public static int[] getAverages(int[] nums, int k) {

        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        int windowSize = 2 * k + 1;

        if (windowSize > nums.length) {
            return result;
        }

        long windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        result[k] =(int) windowSum / windowSize;
        for (int i = k + 1; i < nums.length - k; i++) {
            windowSum = windowSum - nums[i - k - 1] + nums[i + k];
            result[i] = (int) (windowSum / windowSize);
        }
        return result;
    }

    public static int[] getAverages1(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        int windowSize = 2 * k + 1;

        // Window cannot fit even once
        if (windowSize > n) {
            return result;
        }

        long windowSum = 0;

        // Initial window [0 ... 2k]
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }

        // First valid center at index k
        result[k] = (int) (windowSum / windowSize);

        // Slide window
        for (int center = k + 1; center <= n - k - 1; center++) {
            windowSum = windowSum - nums[center - k - 1] + nums[center + k];
            result[center] = (int) (windowSum / windowSize);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages1(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
    }
}
