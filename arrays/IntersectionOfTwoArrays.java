package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        int first = 0;
        int second = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] == nums2[second]){
                set.add(nums1[first]);
                first++;
                second++;
            }else if(nums1[first] < nums2[second]){
                first++;
            }else {
                second++;
            }

        }
        return set.stream().mapToInt(x -> x).toArray();
    }
    public static void main(String[] args) {

    }
}
