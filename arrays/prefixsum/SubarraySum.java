package arrays.prefixsum;

import java.util.Arrays;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < nums.length && prefix[right]<=k){
            right++;
        }
        for (int i = right; i < prefix.length; i++) {
            if(k == prefix[i] - prefix[left]){
                count++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        subarraySum(new int[]{1,2,3,4,5},9);
    }
}
