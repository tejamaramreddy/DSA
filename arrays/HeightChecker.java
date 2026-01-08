package arrays;

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp[i] != nums[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1, 1,4,2,1,3}));
    }
}
