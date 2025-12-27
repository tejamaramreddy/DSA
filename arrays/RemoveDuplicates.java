package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return nums.length;
        }
        int slow =0;
        for(int fast= 1; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        Arrays.stream(nums)
                .limit(slow + 1)
                .forEach(System.out::println);
        return slow + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
