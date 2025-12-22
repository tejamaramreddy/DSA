package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                if(nums[j] == diff){
                    result = new int[]{i, j};
                }
            }
        }
        return result;
    }


    public  static int[] twoSumWithMap(int[] nums, int target){
        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(diffMap.containsKey(diff)){
                return new int[] { diffMap.get(diff), i };

            }
            diffMap.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSumWithMap(nums, target)));
    }
}
