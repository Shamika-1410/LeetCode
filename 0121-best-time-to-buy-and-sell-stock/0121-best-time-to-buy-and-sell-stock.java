class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }else if(prices[i]-buy > maxProfit){
                maxProfit = prices[i]-buy;
            }
        }
        return maxProfit;
    }
}