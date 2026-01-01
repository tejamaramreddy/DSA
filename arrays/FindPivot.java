package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindPivot {
    public  static int pivotIndex(int[] nums){
        int[] prefix = new int[nums.length];
        int index = 0;
        int leftSum = 0;
        for (int item : nums){
            prefix[index] =  leftSum + item;
            leftSum = prefix[index];
            index++;
        }
        leftSum = 0;
        for (int i = 0; i < prefix.length; i++) {
            if(prefix[prefix.length - 1] - leftSum - prefix[i] == 0){
                return i;
            }
            leftSum = prefix[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }
}
