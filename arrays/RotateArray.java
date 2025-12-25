package arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k){
        int[] rotatedArray = new int[nums.length];
        int j = 0;
        for (int i = nums.length  - k; i < nums.length; i++) {
            rotatedArray[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            rotatedArray[j] = nums[i];
            j++;
        }

        return rotatedArray;
    }

    public  static void inPlaceRotate(int[] nums, int k){
        int len = nums.length;
        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);


    }

    public static void reverse(int[] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
    }
}
