package arrays.binarysearch;

public class FirstBadVersion {
    static int badVersion = 3;

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end - start) /2;
            if(isBadVersion(mid)){
                end = mid;

            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int n) {
        return n == badVersion;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(6));
    }
}
