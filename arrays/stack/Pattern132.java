package arrays.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int k = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < k) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                k = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        Pattern132 p = new Pattern132();
        System.out.println(p.find132pattern(new int[]{3, 1, 4, 2}));
        System.out.println(p.find132pattern(new int[]{1,2, 3, 4}));

    }
}
