package p122_stock_II;

public class Solution {
    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            int singleDayProfit = prices[i] - prices[i - 1];
            if (singleDayProfit > 0) {
                result += singleDayProfit;
            }
        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6}));
    }
}
