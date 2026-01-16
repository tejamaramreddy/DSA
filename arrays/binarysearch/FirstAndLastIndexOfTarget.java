package arrays.binarysearch;

import java.util.Arrays;

public class FirstAndLastIndexOfTarget {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        boolean isFirst = true;
        int leftIndex = binarySearch(nums, target, isFirst);
        if (leftIndex == -1) return result;
        int rightIndex = binarySearch(nums, target, !isFirst);

        result[0] = leftIndex;
        result[1] = rightIndex;
        return result;

    }

    public static int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int targetIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                targetIndex = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        int[] data = {5, 7, 7, 8, 8, 10};
        System.out.println("Target 8: " + Arrays.toString(searchRange(data, 8))); // [3, 4]
        System.out.println("Target 6: " + Arrays.toString(searchRange(data, 6))); // [-1, -1]
        System.out.println("Target 7: " + Arrays.toString(searchRange(data, 7))); // [1, 2]
    }
}
