package arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int first = nums[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(first <= nums[i]){
                second = first;
                first = nums[i];
            }else if(second <= nums[i]){
                second = nums[i];
            }
        }
        return (first-1) * (second -1);
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{10,2,5,2}));
    }
}
