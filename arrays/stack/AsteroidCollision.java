package arrays.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            boolean isCollision = false;
            while (!stack.isEmpty() && stack.peekLast() > 0 && asteroid < 0) {
                if (stack.peekLast() == Math.abs(asteroid)) {
                    stack.removeLast();
                    isCollision = true;
                    break;
                } else if (stack.peekLast() < Math.abs(asteroid)) {
                    stack.removeLast();
                } else {
                    isCollision = true;
                    break;
                }
            }
            if (!isCollision) {
                stack.addLast(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        int idx = 0;
        while (!stack.isEmpty()) {
            result[idx++] = stack.removeFirst();
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision asteroidCollision = new AsteroidCollision();
        System.out.println(Arrays.toString(asteroidCollision.asteroidCollision(new int[]{-6, 3, 5, 2, -1, 4})));
    }
}
