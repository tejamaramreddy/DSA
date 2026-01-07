package arrays;


public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int first = nums[0];
        int second = nums[nums[0]];
        while (first != second) {
            first = nums[first];
            second = nums[nums[second]];
        }
        first = nums[0];
        while (first != second) {
            first = nums[first];
            second = nums[second];
        }
        return  first;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,3,3}));
    }
}
