class Solution {
    public int maxProfit(int[] prices) 
    {
        
        int[] buyState = new int[prices.length] ; 
        int[] sellState = new int[prices.length] ; 
        buyState[0] = -prices[0] ; 
        sellState[0] =  0 ; 
        for(int i = 1 ; i < prices.length ; i++)
        {
            buyState[i] = Math.max(sellState[i-1] - prices[i], buyState[i-1]) ; 
            sellState[i] = Math.max(buyState[i-1] + prices[i], sellState[i-1]) ; 
        }
        return Math.max(buyState[prices.length - 1],sellState[prices.length - 1]) ; 
        
    }
}