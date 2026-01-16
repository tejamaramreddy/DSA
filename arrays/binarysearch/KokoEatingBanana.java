package arrays.binarysearch;
import java.util.*;

public class KokoEatingBanana {
    public static int calculateTotalHours(int[] a, int hourly) {
        int totalHours = 0;
        for (int pile : a) {
            // Integer ceil without floating point
            totalHours += (pile + hourly - 1) / hourly;
        }
        return totalHours;
    }

    public static int minEatingSpeed(int[] a, int h) {
        int left = 1;
        int right = Arrays.stream(a).max().getAsInt();
        int answer = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hours = calculateTotalHours(a, mid);

            if (hours <= h) {
                answer = mid;       // valid speed
                right = mid - 1;    // try slower
            } else {
                left = mid + 1;     // too slow
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(a, h));
    }
}
