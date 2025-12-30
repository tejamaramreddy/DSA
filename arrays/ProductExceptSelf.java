package arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0] = 1;

        suffix[suffix.length - 1] = 1;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i-1];
        }
        for (int i = nums.length - 2; i >= 0 ; i--) {
            suffix[i] = nums [i + 1] * suffix[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefix[i] * suffix[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
}
