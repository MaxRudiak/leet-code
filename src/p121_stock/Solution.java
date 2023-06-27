package p121_stock;

public class Solution {

    public static int maxProfit(int[] prices) {
        int res = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            buy = Math.min(price, buy);
            res = Math.max(res, price - buy);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,3,1,7,8,4,6}));
    }
}
