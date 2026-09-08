class Solution {
    public int maxProfit(int[] prices) {
        //Sliding window = 左窗口记录最低价，右窗口不断扩展计算利润。
        int maxP = 0; 
        int minBuy = prices[0]; 

        for(int sell : prices){
            maxP = Math.max(maxP, sell - minBuy); 
            minBuy = Math.min(minBuy, sell); 
        }

        return maxP;
        
        
    }
}
