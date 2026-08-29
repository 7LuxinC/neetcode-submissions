class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            int buyPrice = prices[i];
            int sellPrice = prices[i + 1];
            if (buyPrice < sellPrice) {
                profit += sellPrice - buyPrice;
            }
        }
        return profit;
    }
}