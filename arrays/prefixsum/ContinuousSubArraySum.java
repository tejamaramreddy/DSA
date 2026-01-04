package arrays.prefixsum;

import java.util.HashMap;

public class ContinuousSubArraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;
        HashMap<Object, Object> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = 0;

            if (k == 0) {
                remainder = prefixSum;
            } else {
                remainder = prefixSum % k;
            }
            if (remainderMap.containsKey(remainder)) {
                if (i - (int) remainderMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }
}
