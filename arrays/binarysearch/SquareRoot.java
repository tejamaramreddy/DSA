package arrays.binarysearch;

public class SquareRoot {
    public static int mySqrt(int x) {
        int start = 0;
        int end = x - 1;
        if (x == 0 || x == 1) {
            return x;
        }
        while (start <= end) {
            int mid = start + (end- start) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;

    }
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
        System.out.println(mySqrt(9));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));

    }
}
