package arrays.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubArrayDivisibleByK {
    public static int subArrayDivisibleByK(int[] nums, int k){
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);

        int prefixSum = 0;
        int count =0;

        for(int num: nums){
            prefixSum += num;

            int remainder = (prefixSum + k) % k;
            System.out.println(prefixSum + " " +remainder);

            if(remainderCount.containsKey(remainder)){
                count += remainderCount.get(remainder);
            }
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(subArrayDivisibleByK(new int[]{1,2,3,4,5,9}, 9));
    }
}
