public class Solution {
    public int maxProfit(int[] prices) {
        // int l = 0, r = 1;
        // int maxP = 0;

        // while (r < prices.length) {
        //     if (prices[l] < prices[r]) {
        //         int profit = prices[r] - prices[l];
        //         maxP = Math.max(maxP, profit);
        //     } else {
        //         l = r;
        //     }
        //     r++;
        // }
        // return maxP;
        int minPrice = Integer.MAX_VALUE, best = 0;
        for (int x : prices) { 
            minPrice = Math.min(minPrice, x); 
            best = Math.max(best, x - minPrice); 
            }
        return best;
    }
}