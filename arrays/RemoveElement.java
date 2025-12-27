package arrays;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[pos] = nums[i];
                pos++;
            }
        }

        Arrays.stream(nums).limit(pos + 1).forEach(System.out::println);
        return  pos + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
