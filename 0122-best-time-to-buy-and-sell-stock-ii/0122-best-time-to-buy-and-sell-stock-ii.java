class Solution{
    public int maxProfit(int[] prices){
        int currBuy = prices[0];
        int profit = 0;
        int ans = 0;
        for(int i=0;i < prices.length;i++){
            if( prices[i]>currBuy){
                ans+= prices[i]-currBuy;
            }
            currBuy = prices[i];
        }
        return ans;
    }
}