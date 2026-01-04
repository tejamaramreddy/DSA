package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class NiceSubArrayOfK {
    public static int numberOfSubarrays(int[] nums, int k) {
        int  count = 0;
        int preFixSum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0,1);
        for (int num : nums) {
            preFixSum +=  (num % 2 == 0) ? 0 : 1;
            if(countMap.containsKey(preFixSum - k)){
                count += countMap.get(preFixSum - k);
            }
            countMap.put((preFixSum), countMap.getOrDefault(preFixSum,0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1}, 3));
        System.out.println(numberOfSubarrays(new int[]{2,4,6}, 1));
        System.out.println(numberOfSubarrays(
                new int[]{2,2,2,1,2,2,1,2,2,2}, 2));
    }
}
