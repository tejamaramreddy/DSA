package arrays;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if(arr[start+ 1] > arr[start]){
                start++;
            }else{
                break;
            }
        }
        while (start < end) {
            if(arr[end] < arr[end -1]){
                end--;
            }
            else{
                break;
            }
        }

        return start == end;
    }
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,2,3,4,3,2,1,0}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,8,9,10,11,12,11}));
    }
}
