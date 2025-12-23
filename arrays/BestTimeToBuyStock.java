package arrays;

import java.util.Arrays;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minStock = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minStock = Math.min(minStock, prices[i]);
            int profit = prices[i] - minStock;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
