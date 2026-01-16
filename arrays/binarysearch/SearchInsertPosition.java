package arrays.binarysearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,7,9,11}, 8));
    }
}
