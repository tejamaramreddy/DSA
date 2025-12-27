package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int right = result.length - 1;
        int left = 0;
        int pos = right;

        while(pos >=0){
            if(Math.abs(nums[right]) > Math.abs(nums[left])){
                result[pos] = nums[right] * nums[right];
                right--;
            }else{
                result[pos] = nums[left] * nums[left];

                left++;
            }
            pos--;
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
