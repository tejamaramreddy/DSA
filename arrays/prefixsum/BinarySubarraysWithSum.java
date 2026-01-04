package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {
    public static int numSubarraysWithSum(int[] nums, int k){
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> preFixSumMap = new HashMap<>();
        preFixSumMap.put(0,1);
        for(int num : nums){
            prefixSum += num;
            if(preFixSumMap.containsKey(prefixSum - k)){
                count += preFixSumMap.get(prefixSum - k);
            }
            preFixSumMap.put(prefixSum, preFixSumMap.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1,0,1,0,1};
        int goal1 = 2;
        System.out.println(numSubarraysWithSum(nums1, goal1)); // 4

        // Example 2
        int[] nums2 = {1,0,1,1,0};
        int goal2 = 2;
        System.out.println(numSubarraysWithSum(nums2, goal2)); // 4

        // Example 3
        int[] nums3 = {1,0,0,1,0,1};
        int goal3 = 2;
        System.out.println(numSubarraysWithSum(nums3, goal3)); // 6

        // Example 4
        int[] nums4 = {1,0,1,0,1,0};
        int goal4 = 2;
        System.out.println(numSubarraysWithSum(nums4, goal4)); // 6
    }
}
