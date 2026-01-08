package arrays;

import java.util.Arrays;

public class ArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            if(isEven(nums[start]) &&  isEven(nums[end])){
                start++;
            }else if(!isEven(nums[start]) && !isEven(nums[end])){
                end--;
            } else if(!isEven(nums[start]) &&  isEven(nums[end])){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }else{
                start++;
                end--;
            }
        }
        return nums;
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{1,2,3,4})));
    }
}
