package arrays.binarysearch;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1){
            return true;
        }
        int start = 0;
        int end = num - 1;
        while(start <= end){
            int mid = start + (end - start)/ 2;
            long sq = (long) mid * mid;
            if(sq == num){
                return true;
            }else if(sq > num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(8));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(1));


    }
}
