package arrays;

import java.util.Arrays;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        if(nums.length < 2){
            return nums;
        }
        for (int index = 1; index < nums.length; index++) {
            nums[index] = nums[index] + nums[index - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
}
