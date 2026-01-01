package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault( num, 0) + 1);
            if(map.get(num) > nums.length/2){
                return num;
            }
        }

return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
